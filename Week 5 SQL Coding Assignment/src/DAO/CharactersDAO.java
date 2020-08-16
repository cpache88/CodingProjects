package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.Characters;
public class CharactersDAO {
	
	private Connection connection;
	private SithDAO sithDao;
	private JediDAO jediDao;
	private final String GET_CHARACTERS_QUERY = "SELECT * FROM characters";
	private final String GET_CHARACTERS_BY_ID_QUERY = "SELECT * FROM characters WHERE id = ?";
	private final String CREATE_NEW_CHARACTER_QUERY = "INSERT INTO characters(name) VALUES(?)";
	private final String DELETE_CHARACTER_BY_ID_QUERY = "DELETE FROM characters WHERE id = ?";
	
	public CharactersDAO() {
		connection = DBConnection.getConnection();
		CharactersDAO = new CharactersDAO();
	}
	public List<Character> getCharacters() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_CHARACTERS_QUERY).executeQuery();
		List<Character> characters = new ArrayList<Character>();	
		while (rs.next()) {
			characters.add(populateCharacters(rs.getInt(1), rs.getString(2)));
		}
		return characters;
	}
	public Characters getCharactersId(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_CHARACTERS_BY_ID_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return populateCharacters(rs.getInt(1), rs.getString(2));
	}
	public void createNewCharacter(String characterName) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_CHARACTER_QUERY);
		ps.setString(1, characterName);
		ps.executeUpdate();
	}
	public void deleteCharacterByCharacterId(int id) throws SQLException {
		sithDao.deleteCharactersByCharacterId(id);
		PreparedStatement ps = connection.prepareStatement(DELETE_CHARACTER_BY_ID_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();
	}
	private Characters populateCharacters(int id, String name) throws SQLException {
		return new Characters(id, name, sithDao.getSithCharactersId(id));
	}
	private Characters populateCharacter(int id, String name) throws SQLException {
		return new Characters(id, name, jediDao.getJediCharactersId(id));
	}
}
