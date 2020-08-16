package Entity;

public class Jedi {

	private int jediId;
	private String firstName;
	private String lastName;
	
	public Jedi(int jediId, String firstName, String lastName) {
		this.setJediId(jediId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public int getJediId() {
		return jediId;
	}

	public void setJediId(int jediId) {
		this.jediId = jediId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
