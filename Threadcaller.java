class ChildThread extends Thread{


public void run(){

Thread.yield();


for(int i=0;i<=5;i++){

System.out.println("Child thread "+i);


}


}




}

class Threadcaller{

public static void main(String[] args){


ChildThread ch=new ChildThread ();

ch.start();

for(int i=0;i<=5;i++){

System.out.println( "Main thread "+i);


}


}




}