package inheritance;

public class StudentManager extends UserManager{
	public void startCourse(User user) {
		System.err.println(user.getFirstName()+user.getLastName()+" Kursa Başladı");
	}
}
