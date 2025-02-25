package UserException;

import java.util.*;
public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner(System.in);
		 
		 
		 
		 
		 //AgeExpaction a=new AgeExpaction();
		 int age=scan.nextInt();
	
		 if(age>18 || age <60) {
			 AgeExpaction a=new AgeExpaction("Checkage please");
			 // throw a;
					 
		 }
		 

	}

}
