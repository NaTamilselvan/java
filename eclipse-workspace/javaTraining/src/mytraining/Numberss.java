package mytraining;

public class Numberss {

   	    byte i=0; 
   	    
   	    Numberss(){
   	    	System.out.println("welcome to numbers");
   	    }
	
	public static void main(String[] args) {
	
		
		   Numberss n =new Numberss();
		   
		   n.onedigit();
		   System.out.println();
		   
		   n.twodigit();
		   System.out.println();
		   
		   n.threedigit();
		   System.out.println();
		   		
		   n.fourdigit();

	}
	
	void onedigit() {
		
		//byte  i=0;
		while(i<=9)
			
		System.out.println(i++);
		
	}
	void twodigit() {
		byte  i=10;
		while(i<=99)
			
		System.out.println(i++);
	}

	void threedigit() {
	         short i=99;
		while(i<=999)
			
		System.out.println(i++);
	}
	void fourdigit() {
		short   i=999;
		while(i<=9999)
			
		System.out.println(i++);
	}
	void fivedigit() {
	
		short i=9999;
		
		while(i<100000)
			
		{
			System.out.println(i);
		}
	}
	
	
	
}
