package week3.day1Assignments;

public class Reverse {
	public void Revwords() { 
		
	 String test = "I am a software tester";
	 String[] strrev =	test.split("\\s");
	 
	 for (int i = 0; i < strrev.length; i++) {
		 		 
		 if (i%2==1) {			
			char[] charArray = strrev[i].toCharArray();	
			
			for (int j = charArray.length-1; j >=0; j--) {
				System.out.println(charArray[j]);					
			}
			System.out.println(" ");
		}
			else {
				System.out.print(strrev[i] + " ");
			}			 
		 
	}
	
	 		 
	}

}
