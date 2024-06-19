package com.tamil.package1;

class Achievethread extends Thread{
	
	
	public void run() {
		
		 Thread t=Thread.currentThread();
		
		System.out.println("The Start the userthread  is start");

           String  name=t.getName();
           
           if(t.equals("num"))
        	   printChar();
           
           else if(t.equals("add"))
        	   add();
		else
			try {
				printNum();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	        System.out.println("The Start the userthread  is end ");

	}

	private void printNum() throws Exception  {
		
		System.out.println("Printting num start");
		
		for(int i=0;i<=5;i++) {
			Thread.sleep(3000);
			System.out.println(i);
		}
		System.out.println("Printting num end");
		
	}

	private void add() {
		// TODO Auto-generated method stub
		
System.out.println("Printting add start");
		
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+i);
		}
		System.out.println("Printting add end");
		
		
	}

	private void printChar() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class Userthread {

	public static void main(String[] args) {
                  
		System.out.println("main thread is execute ");

		
		Achievethread as=new Achievethread();
		
		Achievethread as1=new Achievethread();
		
		
		as.setName("num");
		as1.setName("add");
		
		as.start();
		as1.start();
		
		System.out.println("Thread is end for main");
		
	}

}

