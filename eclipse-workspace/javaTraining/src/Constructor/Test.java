package Constructor;

 abstract class Teest {
	
	int a;
	 int b;
	 
	  abstract void kk();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Test t=new Test();
	}

}
class Test extends Teest{
	
	int  a;
	
	void kk() {
		System.out.println(a);
		
		System.out.println(b);
		
	}

	public static void main(String[] args) {
	
		  //Teest t=new Teest();
	
	      Test  t=new Test();
	      t.a=12;
	      t.kk();
	      
	      
	}
	
	
	
}
