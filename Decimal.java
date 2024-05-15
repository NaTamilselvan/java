
import java.util.Scanner;

public class Decimal{

  public static void decimal(int deci){

//to print rev so create a string

String s="";

while(deci>0){



int rem=deci%2;

     s=rem+s;
   deci=deci/2;
  
}  

 System.out.println(s);

}

public static void main(String[] args){


  Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number ");
      
    int a=scan.nextInt();
  decimal(a);

}



}
