package InheritanceRecall;



interface p1{
	
	public abstract void m1();
	//only implementation
	
}

interface p2{
	
	public abstract void m1();
	
}

public class Testmultiple implements p1 , p2 {

	public void m1() {
		System.out.println("Hi i am implemnts interface methods");
	}
	
	
	public static void main(String[] args) {
		
		p1 p=new Testmultiple();
		
		p2 p2=new Testmultiple();
		
		p.m1();
		
		 

	}

}
