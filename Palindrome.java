package Stringprogrames;

import java.util.Scanner;

public class Palindrome {

	
	static String isReverse(String s) {
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		
		return rev;
	}
	
	static boolean isPalindrome(String s) {
		
		if(s.equals(isReverse(s))) {
			return true;
		}
		else 
			return false;
		
		
	}
	
	public static void main(String[] args) {
		
		
		 Scanner scan=new Scanner(System.in);
         System.out.println("Enter the String ");
         
         String s=scan.nextLine();
         
         System.out.println(isReverse(s));
         
         System.out.println(isPalindrome(s));

         
         
	}

}

