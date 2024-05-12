//THis class is practise for yesterday learning 3 ways to handled exception .
//1package 2 is import only one package but import is several.

import java.util.Scanner;
public class Test6{

 static void  fun() throws Exception{

 Scanner scan=new Scanner(System.in);
  try{
System.out.println("Enter the size of array");

int size=scan.nextInt();

//Array decleartion,creation,intialization

int[] aa=new int[size];
}
catch(Exception e ){

System.out.println("The exception is handled inside a function");

throw e;

}


}


public static void main(String[] args){

try{
fun();
}
catch(Exception e){
System.out.println("Exception is handled in catch");
}




}



}
