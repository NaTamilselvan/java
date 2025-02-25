package Constructor;
 
  abstract class Z{
	  
	  int a;
	  
	  Z(){
		 
		 System.out.println("ennada ithu");
	  }
	  
	  
	  Z(int a){
			 
			 System.out.println("ennada ithu a");
		  }
	  
	  Z(int a,int b){
			 
			 System.out.println("ennada ithu a,b");
		  }
		  
		  
	  
  }

public class Problem extends Z {
	
	Problem(){
		System.out.println("This problem class");
	}
	Problem(int a){
		System.out.println("problem class one arg constructor");
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		    new Problem(10);
		        
		  
	}

}
