package Entity;

public class Sith {
	
	private int sithId;
	private String firstName;
	private String lastName;
	
	public Sith(int sithId, String firstName, String lastName) {
		this.setSithId(sithId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public int getSithId() {
		return sithId;
	}

	public void setSithId(int sithId) {
		this.sithId = sithId;
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
