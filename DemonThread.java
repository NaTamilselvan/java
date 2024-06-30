package Multithreadings;


class Test extends Thread{
	
	
	public void run() {
		
		 Thread t=Thread.currentThread();
         
		 String s=t.getName();
		 
		 if(s.equals("TYPE")) {
			 Typing();
		 }
		 else if(s.equals("COMPLIETION")) {
			 
			 codeCompletion();
		 }else
			 autoSaving();
	}

	private void autoSaving() {
		// TODO Auto-generated method stub
	
		System.out.println("The AUTOsaving   is execution start");

		for(;;) {
		try {
			System.out.println("THe codecompletion is start");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The AUTOsaving   is execution end ");
		}
	}

	private void codeCompletion() {
		
		
		System.out.println("THe codecompletion is execution start");
		
		for(;;) {
			
	
			try {
				System.out.println("THe codecompletion is start");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//System.out.println("THe codecompletion is execution End");
		
	}

	private void Typing() {
		
		System.out.println("THe typing is execution start");
		
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("THe typing is start");
		}
		
		System.out.println("THe typing is execution End");
		
	}
	
	
}

public class DemonThread {
	
	public static void main(String[] args) {
		
	   Test t1=new Test();	
		
	     t1.setName("TYPE");
	     

		   Test t2=new Test();	
			
		     t2.setName(" COMPLIETION ");
		      
		     t2.setDaemon(true);

			   Test t3=new Test();	
				
			     t3.setName(" SAVE ");
			     t3.setDaemon( true );    
	     
                 
			     t1.start();
			     
			     t2.start();
                
			     t3.start();
	}

}

