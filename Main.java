package inheritance;

public class Main {

	public static void main(String[] args) {
		User user = new User("Furkan", "Sarm�sak", "123456789", "furkansarmisak@gmail.com");
		User user2 = new User("Fatma", "Y�lmaz", "123456789", "fatmayilmaz@gmail.com");
		Student student=new Student("Merve", "Y�ld�r�m", "123456789", "merveyildirim@gmail.com", "Java");
		Student student2=new Student("Ay�e", "K���k", "123456789", "aysek�c�k@gmail.com", "Pyhton");
		Instructor instructor=new Instructor("Engin", "Demiro�", "123456789", "engindemirog@gmail.com", "Java&React");
		UserManager userManager=new UserManager();
		userManager.add(user);
		System.out.println("////////////////////////////");
		userManager.add(user2);
		System.out.println("////////////////////////////");
		userManager.update(user);
		System.out.println("////////////////////////////");
		userManager.update(user2);
		System.out.println("****************************");
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		System.out.println("////////////////////////////");
		studentManager.add(student2);
		System.out.println("////////////////////////////");
		studentManager.update(student);
		System.out.println("////////////////////////////");
		studentManager.update(student2);
		System.out.println("////////////////////////////");
		studentManager.startCourse(student);
		System.out.println("////////////////////////////");
		studentManager.startCourse(student2);
		System.out.println("****************************");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		System.out.println("////////////////////////////");
		instructorManager.update(instructor);
		System.out.println("////////////////////////////");
		instructorManager.addCourse();
	}
}
