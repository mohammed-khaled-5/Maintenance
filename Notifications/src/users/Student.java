package users;

public class Student implements User {
	String name;
	int id;
	String email;
	String phoneNumber;
	
	
	
	public Student(String name, int id, String email, String phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

	public String getEmail() {
		return email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	
	
	public void notifyStudent(String message) {
		// do some stuff
	}


	@Override
	public void update() {
		// do some stuff
		
	}
	
}
