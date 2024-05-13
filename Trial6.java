/* This program training for exception rules 

rule 1 one thing remember inheritance a class inherties a parent class method we can cutomized overwritten a program 


what are rules follow 


1.)access modifier is to child class same access modifier or more accesss 

2.)return type same or coverient return type means parent child relation ship .

3.)method name is same .



but one thing the parent class throws duckinga exceptions.


the overwrite a child class is  may not throw or doesnot rule one */


class AA{

public void fun() throws ArithmeticException{

System.out.println(" This parent class fun method");

}

} 


class BB extends AA{

public void fun(){

System.out.println(" This child class fun method");

}

}

public class  Trial6 {

public static void main(String[] args){
  
  BB b=new BB();

   b.fun();

}

} 





