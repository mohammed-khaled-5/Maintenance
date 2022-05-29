package users;
import java.util.ArrayList;

import gateways.EmailGateway;
import messages.TaskAddedEmailMessage;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<Professor> professorsForEmailNotification;
	ArrayList<Professor> professorsForSMSNotification;
	
	ArrayList<TA> tasForEmailNotification;
	ArrayList<TA> tasForSMSNotification;
	
	ArrayList<Student> studentsForEmailNotification;
	ArrayList<Student> studentsForSMSNotification;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<>();
		exams = new ArrayList<>();
		grades = new ArrayList<>();
		
		professorsForEmailNotification = new ArrayList<>();
		professorsForSMSNotification = new ArrayList<>();
		
		tasForEmailNotification = new ArrayList<>();
		tasForSMSNotification = new ArrayList<>();
		
		studentsForEmailNotification = new ArrayList<>();
		studentsForSMSNotification = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeProfessorForEmailNotification(Professor professor) {
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		tasForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		tasForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		studentsForSMSNotification.add(student);
	}
	
	
	
	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();
		
		
		for (Professor professor : professorsForEmailNotification) {
			professor.notifyProfessor(notification);
			emailGateway.sendMessage(notification, professor.getEmail());
		}
		
		for (TA ta : tasForEmailNotification) {
			ta.notifyTA(notification);
			emailGateway.sendMessage(notification, ta.getEmail());
		}
		
		for (Student student : studentsForSMSNotification) {
			student.notifyStudent(notification);
			emailGateway.sendMessage(notification, student.getEmail());
		}
	}
	
	
	
	
}
