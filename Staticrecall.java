package EverydayRecall;

public class Staticrecall {
	
	
	static int  a=0;
	
	static float  b=10.0f;
	
	
	static String s="tamil";

	
	double d=0;

	String clf="abc";
	static {
		
		System.out.println("hi i am sataic block");
		System.out.println(0);
	}
	
	{
		System.out.println("Hi i am not static container ");
		System.out.println(d);
		System.out.println(clf);
		System.out.println(s);
	}
     public Staticrecall() {
	  System.out.println("Hi i am constructor ");
	}

     
     void display() {
    	 System.out.println(d);
    	 System.out.println(s);
    	 System.out.println(b );
    	 
    	 Staticrecall s1=new Staticrecall();
    	 
    	 s1.display();
     }
     
     public static void main(String[] args) {
    	 
    	 
    	 Staticrecall s=new Staticrecall();
    	 
    	 System.out.println(s.d);
    	 
    	 s.display();

    	
    
    	 
     }
	
}

