import java.util.ArrayList;

public class Recallm{

public static void main(String[] args){

//arraylist list to to overcome arrray to store hertogenous data and arraylist size can size increase and decrase 
//array is once created not decrease and increase 
//but how array list do they follow formula 3/2 * old array size +1;
//initiali array list to size 10 but cappabuel size you al.print 0 
//if enter the element you can use un wasted time toTrimSize 

 
 ArrayList  al=new ArrayList();

 System.out.println("THe initalize size is "+al.size());

 //to add element 

 al.add(10);

 al.add(20);

 al.add(30);

 al.add(40);

 al.add("tamil");

System.out.println("THE ADDED FIRST \"5\" VALUE \\"+al);

al.add(2,"I am secound index value");

System.out.println("THE  the specific index "+al);

//now add index for the behind tha values move rightside 

//but the set is replace index value

   al.set(2,"I am replace set method ");

System.out.println(al);

//now to manipualte data 

System.out.println("The thired index values input index output values"+al.get(3));

System.out.println("The manipulate data is list "+al.subList(1,4));

//get to input as index to get index data 

//al.List(o,toindex if you want 4 index you give 5 );

System.out.println("The to index get index input as data values output is index "+al.indexOf(40));

al.add(40);

System.out.println("THe double occuer data values to get lastindex values "+al.lastIndexOf(40));

System.out.println("The size of array "+al.size());



//to add another arraylist

 ArrayList  al2=new ArrayList();

al.add(10);

al.add(30);

al.add(40);

System.out.println(al);

System.out.println(al.addAll(al2));

//you can insex mentiomn
 
al.addAll(2,al2);

System.out.println(al);

//you can also remove 

al.removeAll(al2);

System.out.println(al);

System.out.println("The index of 30"+al.indexOf(20));

System.out.println("The last occur index of 30"+al.lastIndexOf(20));

al.clear();

System.out.println(al);

//index of value to give get a index 

//the last occur same element 

//al.lastindexof


//remove to remove elemernt


//remove to secound array list element values 

//al,removeaall



//al.clear   */

 



   

 


}
}
