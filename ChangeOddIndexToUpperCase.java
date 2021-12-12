package week3.day1Assignments;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] strlen = test.toCharArray();
		
		for (int i = 0; i < strlen.length; i++) {
			
			if (i%2==0) {
				System.out.println(Character.toUpperCase(strlen[i]));
				
			}
			else {
				System.out.println(strlen[i]);
			}
			
		}
		
		
		
		
		
	}

}
