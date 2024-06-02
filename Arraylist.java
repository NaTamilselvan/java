import java.util.*;
 public class  Arraylist{

public static void main(String[] args){


ArrayList  al=new ArrayList();//Intially cabaple store 10 values size is zero.


al.add(10);

al.add(20);

al.add(40);

al.add(50);

al.add("Tamil selvan");


System.out.println(al);

//al.add(int index,object );

//this posible to erroe becaue initially this arrau list empty


System.out.println(al.get(2)); 

al.add(0,"dddd");


for(int i=0;i<=al.size()-1;i++){

System.out.println(al.get(i));
}






}




}
