package week3.day1Assignments;

public class Assignment7_2 {

	public static void main(String[] args) {
		String val1="I am Learning Java";
		String val2="I am learning java";
		
		if (val1==val2) {
			System.out.println("String is not executed");
			
		} 
		if (val1.equals(val2)) {
			System.out.println("String is executed with equals operator");
			
		}else if (val1.equalsIgnoreCase(val2)) {
			System.out.println("String is executed with equalsIgnoreCase operator");
			
		} 
		
		
	}

}
