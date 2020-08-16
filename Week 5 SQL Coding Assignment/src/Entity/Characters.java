package Entity;

import java.util.List;

public class Characters {

	private int id;
	private String name;
	private List<Jedi> jedi;
	private List<Sith> sith;
	
	public Characters(int id, String name, List<Sith> sith, List<Jedi> jedi) {
		this.setId(id);
		this.setName(name);
		this.setJedi(jedi);
		this.setSith(sith);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Jedi> getJedi() {
		return jedi;
	}

	public void setJedi(List<Jedi> jedi) {
		this.jedi = jedi;
	}

	public List<Sith> getSith() {
		return sith;
	}

	public void setSith(List<Sith> sith) {
		this.sith = sith;
	}
}
