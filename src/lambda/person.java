package lambda;

public class person {

	private	int id;
	private String firstname;
	private String lastname;


	public person(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}


	public person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}



	
	
}
