package inheritance;

public class Main {

	public static void main(String[] args) {
		User user = new User("Furkan", "Sarmısak", "123456789", "furkansarmisak@gmail.com");
		User user2 = new User("Fatma", "Yılmaz", "123456789", "fatmayilmaz@gmail.com");
		Student student=new Student("Merve", "Yıldırım", "123456789", "merveyildirim@gmail.com", "Java");
		Student student2=new Student("Ayşe", "Küçük", "123456789", "aysekücük@gmail.com", "Pyhton");
		Instructor instructor=new Instructor("Engin", "Demiroğ", "123456789", "engindemirog@gmail.com", "Java&React");
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
