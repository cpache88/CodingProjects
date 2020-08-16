package Application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import DAO.CharactersDAO;
import DAO.JediDAO;
import DAO.SithDAO;
import Entity.Characters;
import Entity.Sith;

public class Menu {
	
	private CharactersDAO charactersDao = new CharactersDAO();
	private SithDAO sithDao = new SithDAO();
	private JediDAO jediDao = new JediDAO();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Characters", 
			"Display a Character", 
			"Create a Character", 
			"Delete a Character",
			"Create a Sith", 
			"Delete a Sith",
			"Create a Jedi", 
			"Delete a Jedi");

	public void start () {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
				if (selection.equals("1")) {
					displayCharacters();
				} else if (selection.equals("2")) {
					displayCharacters();
				} else if (selection.equals("3")) {
					createCharacter();
				} else if (selection.equals("4")) {
					deleteCharacter();
				} else if (selection.equals("5")) {
					createSith();
				} else if (selection.equals("6")) {
					deleteSith();
				} else if (selection.equals("7")) {
					createJedi();
				} else if (selection.equals("8")) {
					deleteJedi();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
				
			System.out.println("Press enter to contine....");
			scanner.nextLine();
		} while (!selection.equals("-1"));
	}
		
		private void printMenu() {
			System.out.println("Select an Option: \n--------------------------------------");
			for (int i = 0; i < options.size(); i++) {
				System.out.println(i + 1 + ") " + options.get(i));
			}
		}
		
		private void displayCharacters() throws SQLException {
			List<Character> characters = charactersDao.getCharacters();
			for (Character character : characters) {
				System.out.println(character.getCharactersId() + ": " + character.getName());
			}
		}
		
		private void displayCharacter() {
			System.out.println("Enter Character ID: ");
			int id = Integer.parseInt(scanner.nextLine());
			Character character = CharactersDAO.getCharactersId);
			System.out.println(character.getCharactersId() + ": " character.getName());
			for (Sith sith : character.getSith()) {
				System.out.println("\tSithId: " + sith.getSithId() + " - Name: " + sith.getFirstName() + " " + sith.getLastName());
			}
		}
		
		private void createCharacter() throws SQLException {
			System.out.print("Enter new character name:");
			String characterName = scanner.nextLine();
			charactersDao.createNewCharacter(characterName);
		}
		
		private void deleteCharacter() throws SQLException {
			System.out.print("Enter character id to delete:");
			int id = Integer.parseInt(scanner.nextLine());
			charactersDao.deleteCharacterById(id);
}
		private void createSith() throws SQLException {
			System.out.println("Enter first name of new Sith");
			String firstName = scanner.nextLine();
			System.out.println("Enter last name of new Sith");
			String lastName = scanner.nextLine();
			System.out.println("Enter character id of new Sith");
			int characterId  = Integer.parseInt(scanner.nextLine());
			sithDao.createNewSith(firstName, lastName, characterId);
		}
		
		private void createJedi() throws SQLException {
			System.out.println("Enter first name of new Jedi");
			String firstName = scanner.nextLine();
			System.out.println("Enter last name of new Jedi");
			String lastName = scanner.nextLine();
			System.out.println("Enter character id of new Jedi");
			int characterId  = Integer.parseInt(scanner.nextLine());
			jediDao.createNewJedi(firstName, lastName, characterId);
		}
		
		private void deleteSith() throws SQLException {
			System.out.println("Enter Sith to delete");
			int characterId  = Integer.parseInt(scanner.nextLine());
			sithDao.deleteSithById(id);
		}
		
		private void deleteJedi() throws SQLException {
			System.out.println("Enter Jedi to delete");
			int characterId  = Integer.parseInt(scanner.nextLine());
			jediDao.deleteJediById(id);
		}
}
