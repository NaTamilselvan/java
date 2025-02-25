package dailysome;

import java.util.HashSet;
import java.util.Scanner;

public class IsVowels {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		
		String s=scan.next();
		
		 HashSet hs =new HashSet();
		 
		 String vowels="aeiou";
		 
		 for(int i=0;i<s.length();i++) {
			 
			 //System.out.println("one"+s.charAt(i));
			 if (s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			
				// System.out.println("two    "+s.charAt(i));
				 hs.add(s.charAt(i));
			 }
		 }

		 System.out.println(hs);
		 
		 if (hs.size()== 5) {
			 System.out.println("Its contains voewls");
		 }
		 else {
			 System.out.println("Not contain");
		 }
		 
		 
		
		
		
		

	}

}
