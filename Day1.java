class One{ /* parent class and its child class of Object class its hiarchy //single inhertiance multilevel inheritance and hiarchy not ////multiple hierarchy.*/

public void fun() throws ArrayIndexOutOfBoundsException{


System.out.println("This method is executed on parent class");


}

}

class Two  extends One{


public void fun() throws SocketException  {


System.out.println("This method is executed on child class");


}


}

public class Day1{

public static void main(String[] args){

Two  t=new Two();

t.fun();

}


}
