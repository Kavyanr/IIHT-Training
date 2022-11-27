package Encapsulation;

public class App {

	public static void main(String[] args) {
		Course course = new Course();
		course.setCourse_name("Java");
		course.setName("Manish");
		System.out.println("Student Name = " + course.getName());
		System.out.println("Course Name =" +course.getCourse_name());
		

	}

}
