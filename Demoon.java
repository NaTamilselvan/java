package mysimpleprogram;

class Demo extends Thread{
	
 public void run() {
		
	 System.out.println("user thread execute is stared");
	 
	 for(int i=0;i<5;i++) {
	
		 System.out.println("user thread is executing i "+i);
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 
	 
	 System.out.println("user thread execute is  end ");
	 
	}
	
	
}

class Demo1 extends  Thread {

    public void run() {
	
	 System.out.println("Demaon thread execute is stared");
	 
	 for(;;) {
		 System.out.println("DEon thread is executing i ");
	 
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 }
	 
	 
	 
	 
	 //System.out.println("user thread execute is  end ");
	 
	}
	
	
}




public class Demoon {

	public static void main(String[] args) {
		
		 Demo t=new Demo();
	
		 t.start();

		 Demo1 t1=new Demo1();
			
	 t1.setDaemon(true);
		 t1.start();
		 

	}

}
