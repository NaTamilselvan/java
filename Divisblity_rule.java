package Appitude;

import java.util.Scanner;

public class Divisblity_rule {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int number=scan.nextInt();
		
		for(int i=2;i<=number;i++) {
			
			if (number%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
