package week3.day1Assignments;

public class Assignment6 {
	
	public static void main(String[] args) {
		
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
		 
		// == should be used during refence comparision...
		// whereas equals should be used to compare the content of the 2 Strings
		
		if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
	}

}
