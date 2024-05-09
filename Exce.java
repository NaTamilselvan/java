//Now i start exception handling in java unwanted and unexpected movement distrub normal flow of execution.
//in java convert to machine code is two phases one is compilation and anotherone is exception 
import java.util.Scanner;

public class Exce {


 public static void main(String[] args){


 Scanner scan=new Scanner(System.in);

try{
 System.out.println("Enter tha a value");

 int a=scan.nextInt();

 System.out.println("Enter tha b value");

 int b=scan.nextInt();
  
 System.out.println("Enter the size of array");

   int size=scan.nextInt();

   int[] array=new int[size];

    //array=null;

   System.out.println("Enter the postion");

   int postion=scan.nextInt();

   System.out.println("enter the value ");

   int value=scan.nextInt();
   
array[postion]=value;
}

catch(InputMismatchException ime){// InputMismatchException
System.out.println("put correct input");
}

catch(Exception e){
System.out.println("The generic exception");
}



}
} 
