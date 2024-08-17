package EverydayRecall;

import java.util.Scanner;



class Dem{
	
	static void fib() {
    System.out.println("Enter the number");
    
     Scanner scan=new Scanner(System.in);
     
     int num=scan.nextInt();
     
     int a=0;
     int f=1,s=1;
     
     if(num==0 || num==1) {
    	 System.out.println("Prime number");
    	 
     }
     else {
     
     while(a<num)
     {
    	 a=f+s;
    	 f=s;
    	 s=a;
    	 
     }
     
     if(s==num) {
    	 System.out.println("prime");
     }
     else {
    	 System.out.println("Not prime");
     }
     
     
     }
	}
	
	
}



public class Checkfibo {

	public static void main(String[] args) {
		
		Dem.fib();

		
		
	}

}

