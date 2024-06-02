import java.util.*;
 public class  List1{

public static void main(String[] args){


ArrayDeque  al=new ArrayDeque();//Intially cabaple store 10 values size is zero.

//PriorityQueue  al=new PriorityQueue();//

//TreeSet al=new TreeSet();

//HashSet al =new HashSet();

//LinkedHashSet al =new LinkedHashSet();
al.add(10);

al.add(20);

al.add(40);

al.add(50);

//al.add("Tamil selvan");


System.out.println(al);

//al.add(int index,object );

//this posible to erroe becaue initially this arrau list empty

/*for(int i=0;i<al.size();i++){


System.out.println(al.get(i));

}*/

for(Object temp:al){

System.out.println(temp);
}



Iterator a=al.iterator();

System.out.println(a);

a.hasNext();


System.out.println(a);



}




}
