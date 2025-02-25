package StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseword {
	
	
	
	public String reverseWord(String s) {
		
		//Arrays.sort(null);
		
		String[] str=s.split(" ");
		
		try {
		for(int i=str.length-1;i>=0;i--) {
			
			System.out.print(str[i]);
		}
		}
		catch(Exception e) {
			System.out.println("Please check loops");
		}
		
		
		
		
		
		
		
		return null;
	}

	public static void main(String[] args) {
		 
		Reverseword r=new Reverseword();
		
		
		   System.out.println("Enter the string ");
		   
		    Scanner sc=new Scanner(System.in);
             
		    String s=sc.next();
		    
		    r.reverseWord(s);
		 
	}

}
