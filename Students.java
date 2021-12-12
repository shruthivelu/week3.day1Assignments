package week3.day1Assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("student id is " + id );

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("student id and name is " + id + " " + name);

	}
	
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("student email and phonenumber is " + email + " " + phonenumber);

	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(12);
		stu.getStudentInfo(1234, "Shruthi");
		stu.getStudentInfo("shruthisubha09@gmail.com", "9876504321");

	}

}
