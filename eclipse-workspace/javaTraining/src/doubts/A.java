package doubts;

public class A {
	
	public void methd() {
		System.out.println("Hi i am a class method");
	}
	
	A(){
		System.out.println("Hi i am no argument constructor ");
	}
	A(int a){

		System.out.println("Hi i am single argument constructor");
				
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     A a=new A(6);
		
	}

}
