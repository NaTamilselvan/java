//threads means single task multithreading multiple task in a process.

//It means doing many things at same time .its means coucurrently ,or parellel execution .

 class Threads1 extends Thread{

//no instance or no fileds 



public void run() {

for(int i=0;i<=5;i++){

System.out.println("The Threads1 class "+i);

}

System.out.println(getState());

}



}




public class Threadcaller1{

//no instance 

public static void main(String[] args){

    Threads1 t1=new Threads1();

   //Threads1 t2=new Threads1();
    System.out.println(t1.getState());

     t1.start();

 System.out.println(t1.getState()); 

  System.out.println(t1.getPriority());
t1.setPriority(10);

t1.setName("Tamil");

System.out.println( t1.getName() );
    
//t2.start();
//getState method is showing thread is which state 

 for(int i=0;i<=5;i++){

System.out.println("The main1 class "+i);

} System.out.println(t1.getState());

}






}


