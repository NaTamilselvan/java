package variableRelation;

class Vechicle{
	
	
	public void m1() {
		System.out.println("Tamil");
	}
	
	public void m1(int a) {
		System.out.println("Tamilselvan");
	}
	
	
	public void start() {
		System.out.println("The parent vechicle start");
	}
	
	
}



class Bike extends Vechicle{
	
	public void start() {
		System.out.println("The bike vechicle start");
	}
	
	
}


class Bus extends Vechicle{
	
	public void start() {
		System.out.println("The Bus vechicle start");
	}
	
	
}




public class Dynamic {

	public static void main(String[] args) {
		
		Vechicle v;
		
		 v=new Bus();
		 
		 v.start();
		
		
		 v=new Bike();
		 
		 v.start();
		 
		 v.m1();
		 
		 v.m1(10);
		

	}

}
