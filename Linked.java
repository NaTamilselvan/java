import java.util.LinkedList;
import java.util.ArrayList;

import java.util.Scanner;
public class Linked{


public static void main(String[] args){
 
  ArrayList al=new ArrayList();
  
 

 LinkedList l=new LinkedList();

  System.out.println(l.size());

l.add(10);

l.add(20);

l.add(30);

l.add("tamil");

System.out.println(l);

System.out.println(l.get(2));

System.out.println(l.indexOf("tamil"));

LinkedList ll=new LinkedList();

ll.add(10);

ll.add(20);

System.out.println(l.contains(30));

System.out.println(l.containsAll(l));

System.out.println(l);

System.out.println(l.peekFirst());

System.out.println(l);

System.out.println(l.pollFirst());

System.out.println(l);

System.out.println(l.getLast());

System.out.println(l.peekLast());


System.out.println(l.pollLast());

LinkedList kl=(LinkedList)l.clone();//down casting 

System.out.println(kl);


//linked list to implemented stack stack is a data structure 

kl.push("last");

System.out.println(kl);


kl.pop();

kl.pop();

kl.pop();

kl.pop();


System.out.println(kl);




}




}
