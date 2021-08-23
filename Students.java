package week3.day1.assignments.org.system;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("ID of the Student : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("ID of the Student : " + id);
		System.out.println("Name of the Student : " + name);
	}

	public void getStudentInfo(String email, double ph) {
		System.out.println("Mail Id of the Student : " + email);
		System.out.println("Contact number of the Student : " + ph);
	}

	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(129776);
		std.getStudentInfo(129776, "Sakthivel Dhanabal");
		std.getStudentInfo("abcd@gmail.com", 9876543);
		System.out.println("Result executed");
	}

}
