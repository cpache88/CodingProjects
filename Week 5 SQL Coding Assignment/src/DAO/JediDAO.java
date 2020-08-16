package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.Jedi;

	public class JediDAO {
		
		private Connection connection;
		private final String GET_JEDI_BY_CHARACTER_ID_QUERY = "SELECT * FROM jedi WHERE character_id = ?";
		private final String DELETE_CHARACTERS_BY_CHARACTER_ID_QUERY = "DELETE FROM jedi_id = ?";
		private final String CREATE_NEW_JEDI_QUERY = "INSERT INTO jedi(first_name, last_name, character_id) VALUES (?,?,?)";
		private final String DELETE_JEDI_BY_ID_QUERY = "DELETE FROM jedi WHERE id = ?";
		
		public JediDAO() {
			connection = DBConnection.getConnection();
		
		public List<Jedi> getJediByCharacterId(int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(GET_JEDI_BY_CHARACTER_ID_QUERY);
			ps.setInt(1, character_Id);
			ResultSet rs = ps.executeQuery();
			List <Jedi> sith = new ArrayList<Jedi>();
			
			while (rs.next()) {
				jedi.add(new Jedi(rs.getInt(1), rs.getString(2), rs.getString(3)));
			
			return jedi;
			}
			
		public void createNewJedi(String first_Name, String last_Name, int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_JEDI_QUERY);
			ps.setString(1, first_Name);
			ps.setString(1, last_Name);
			ps.setInt(3, character_Id);
			ps.executeUpdate();
		}
	}
		public void deleteCharactersByCharacterId (int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(DELETE_CHARACTERS_BY_CHARACTER_ID_QUERY);
			ps.setInt(1, character_Id);
			ps.executeUpdate();
		}
		
		public void deleteJediById (int character_Id) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(DELETE_JEDI_BY_ID_QUERY);
			ps.setInt(1, character_Id);
			ps.executeUpdate();
		}
	}
}
