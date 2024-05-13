/* This program training for exception rules 

rule 1 one thing remember inheritance a class inherties a parent class method we can cutomized overwritten a program 


what are rules follow 


1.)access modifier is to child class same access modifier or more accesss 

2.)return type same or coverient return type means parent child relation ship .

3.)method name is same .



but one thing the parent class throws duckinga exceptions.


the overwrite a child class is  may not throw or doesnot rule one


if child class overwritten method to like throws a exception the same parent class method return same otherwise we will get error

if a method present in parent class throws one type of exceptions and overriddenmethod in child class throws another types of exceptionit is not allowed 

but one thing is noted if you a method in child class overwritten a perent class method only subtitude only unchecked exceptions not checked exceptions.


 */

import java.sql.SQLException;

class AA{

public void fun() throws ArithmeticException{

System.out.println(" This parent class fun method");

}

public void fun2() throws SQLException{

System.out.println("This is parent class fun2 method");

}

} 


class BB extends AA{

public void fun() throws NegativeArraySizeException{

System.out.println(" This child class fun method");

}

public void fun2() throws SQLException{//Its error

System.out.println("This is child  class fun2 method");

}

}

public class  Trial62{

public static void main(String[] args){
  
  BB b=new BB();

   b.fun();
try{
   b.fun2();
}
catch(Exception e){
System.out.println("They checked exceptions");
}
}

} 





