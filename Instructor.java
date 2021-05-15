package inheritance;

public class Instructor extends User{
	
	private String instructorCourses;

	public Instructor(String firstName, String lastName, String phoneNumber, String email, String instructorCourses) {
		super(firstName, lastName, phoneNumber, email);
		this.instructorCourses = instructorCourses;
	}

	public String getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(String instructorCourses) {
		this.instructorCourses = instructorCourses;
	}
}
