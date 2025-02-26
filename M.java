class AF{


	AF(){

		System.out.println("Hi i am parent classs constructor");

	}


public void m1(){




}



}
public class  M extends AF{


	public void add2(){

		add();

	}

	public void add(){

          try{      
		System.out.println(10/0);
              }
	  catch(ArithmeticException e){
		  
		  System.out.println("I am Handled ");
		  throw e;

	  }

	}


	public static void main(String[] args){


		 M ff=new M();

	       	// ff.add2();//method calling statement;

		// throw new Exception("Hi hendeled");
                  try{
			  ff.add();
		// throw new ArithmeticException("/ by zero this exception created by n tamilselvan");
		  }
		  catch( ArithmeticException ae){

System.out.println("Hi i am catched one exception");

		  }

	}

	



}
