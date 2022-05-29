package observer;

import users.Professor;
import users.Student;
import users.TA;

  public interface Subject {
    public void subscribeStudentForSMSNotification(Student student);
    public void subscribeStudentForEmailNotification(Student student);
    public void subscribeTAForSMSNotification(TA ta);
    public void subscribeTAForEmailNotification(TA ta);
    public void subscribeProfessorForSMSNotification(Professor professor);
    public void subscribeProfessorForEmailNotification(Professor professor);
    public void remove(Observer o);
    public void notifyAllUsers(String[] placeholders);
}
