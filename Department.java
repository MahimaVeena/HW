package ReferenceExample;

public class Department {
	int id;
	String name;
	int subjectsOffered;

	public Department(int id, String name, int subjectsOffered) {
		super();
		this.id = id;
		this.name = name;
		this.subjectsOffered = subjectsOffered;
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

	public int getSubjectsOffered() {
		return subjectsOffered;
	}

	public void setSubjectsOffered(int subjectsOffered) {
		this.subjectsOffered = subjectsOffered;
	}
	
	
}
