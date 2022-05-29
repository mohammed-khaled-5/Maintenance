package users;

import java.sql.Date;

public class Professor implements User{
	String name;
	String department;
	Date hirringDate;
	String phDTopic;
	String email;
	String phoneNumber;
	
	
	public Professor(String name, String department, Date hirringDate, String phDTopic, String email,
			String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.hirringDate = hirringDate;
		this.phDTopic = phDTopic;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
	
	public String getDepartment() {
		return department;
	}
	
	public Date getHirringDate() {
		return hirringDate;
	}
	
	public String getPhDTopic() {
		return phDTopic;
	}
	
	
	public void notifyProfessor(String message) {
		// do some stuff
		
	}


	@Override
	public void update() {
		// do some stuff
		
	}
	
	
	
}
