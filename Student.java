package inheritance;

public class Student extends User {
	private String attendedCourse;
	public Student(String firstName, String lastName, String phoneNumber, String email, String attendedCourse) {
		super(firstName, lastName, phoneNumber, email);
		this.attendedCourse = attendedCourse;
	}
	public String getAttendedCourse() {
		return attendedCourse;
	}
	public void setAttendedCourse(String attendedCourse) {
		this.attendedCourse = attendedCourse;
	}
}
