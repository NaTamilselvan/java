import java.util.Scanner;

public class Digitcount{


public static void main(String[] args){



 Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number");

    long num=scan.nextInt();
   long sum=0;
    int count=0;
   while(num>0){

     long rem=num%10;
        sum=sum+rem;
     //System.out.println(rem);
      num=num/10;
       count++;
   }
  

  System.out.println("The total digit is "+count);


    System.out.println("The sum of digits"+sum);
}



}
