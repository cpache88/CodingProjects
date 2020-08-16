package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.Sith;

public class SithDAO {
	
	private Connection connection;
	private final String GET_SITH_BY_CHARACTER_ID_QUERY = "SELECT * FROM sith WHERE character_id = ?";
	private final String DELETE_CHARACTERS_BY_CHARACTER_ID_QUERY = "DELETE FROM sith_id = ?";
	private final String CREATE_NEW_SITH_QUERY = "INSERT INTO sith(first_name, last_name, character_id) VALUES (?,?,?)";
	private final String DELETE_SITH_BY_ID_QUERY = "DELETE FROM sith WHERE id = ?";
	
	public SithDAO() {
		connection = DBConnection.getConnection();
	
	public List<Sith> getSithByCharacterId(int character_Id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_SITH_BY_CHARACTER_ID_QUERY);
		ps.setInt(1, character_Id);
		ResultSet rs = ps.executeQuery();
		List <Sith> sith = new ArrayList<Sith>();
		
		while (rs.next()) {
			sith.add(new Sith(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
	}
		return sith;
		}
		
		public void createNewSith(String first_Name, String last_Name, int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_SITH_QUERY);
			ps.setString(1, first_Name);
			ps.setString(1, last_Name);
			ps.setInt(3, character_Id);
			ps.executeUpdate();
		}
			
		public void deleteCharactersByCharacterId (int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(DELETE_CHARACTERS_BY_CHARACTER_ID_QUERY);
			ps.setInt(1, character_Id);
			ps.executeUpdate();
		}
		
		public void deleteSithById (int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(DELETE_SITH_BY_ID_QUERY);
			ps.setInt(1, character_Id);
			ps.executeUpdate();
	}
}
