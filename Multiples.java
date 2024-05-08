import java.util.Scanner;

 public class  Multiples{



public static void main(String[] args){


 Scanner scan=new Scanner(System.in);

 //rollback-database opertion data contol language dcl

   System.out.println("Enter the  a value ");

   int a=scan.nextInt();

   System.out.println("Enter the  b value ");

   int b=scan.nextInt();
  
System.out.println("Enter the  n  end  value ");

   int n=scan.nextInt();

 for(int i=1;i<=n;i++){
    
   if((i%a==0)&(i%b==0)){

     System.out.println("The common multiples of "+i);
      }

    }
  
    
    
    

}

} 
