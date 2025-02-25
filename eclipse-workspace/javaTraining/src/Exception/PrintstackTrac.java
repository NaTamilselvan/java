package Exception;

import java.util.*;//explicit 

public class PrintstackTrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scan=new Scanner(System.in);
		
		  int a=scan.nextInt();
		  int b=scan.nextInt();
		  try {
		  int c=a/b;
		  }
		  catch(ArithmeticException e) {
			  
			 // e.printStackTrace();
			  e.toString();
			  //e.getMessage();
			  //e.getClass();
			  
		  }
	}

}
