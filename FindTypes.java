package week3.day1Assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] str = test.toCharArray();		
		for (int i = 0; i < str.length; i++) {
			char ch = str[i];	
			
			if (Character.isLetter(ch)) {
				
				letter = letter+1;
			}
	
			if (Character.isDigit(ch)) {
				
				num = num+1;
			}			
			if (Character.isSpaceChar(ch)) {
				
				space = space+1;
				
			}
			
			else {
				specialChar = specialChar+1;
				
			}			
			
		}
		System.out.println("Letter: "+ letter);
		System.out.println("Number: "+ num);
		System.out.println("Space: "+ space);
		System.out.println("SpecialCharacter: " + specialChar);

	}

}
