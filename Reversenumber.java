import java.util.Scanner;

public class Reversenumber{


public static void main(String[] args){



 Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number");

    int a=scan.nextInt();

   while(a>0){

      int rem=a%10;
     System.out.println(rem);
      a=a/10;

   }
  



}


}
