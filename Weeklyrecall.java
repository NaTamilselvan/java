/* This program is weekely recall session in 12/05/2024 sunday 

recall for oops   

basic concept 1.)method overloading .

what is method overloading in java same method name with several methods but different is 

no of arguments 

type of arguments 

order of type of arguments  

we can static method also over loading and constructor overloading.*/

public class Weeklyrecall{

String name;

String surname;
long number;

 int date;
 default void editprofile(String name){
 System.out.println("your name is"+name); 
//this one of the string method is s.concat("hi");
}

void editprofile(String name,String surname){
 System.out.println("your name is"+name); 

}
void editprofile(long number){
  this.number=number;
 System.out.println(" my number is " +number);  
}

void editprofile(int  date ){
  this.date=date ;
 System.out.println("your date is" +date); 
}
public static void main(String[] args){
 
   Weeklyrecall w=new Weeklyrecall();
   w.editprofile("tamil");
   w.editprofile("tamil","selvan" );
   w.editprofile(8778685072l);
   w.editprofile(28);
}



}


