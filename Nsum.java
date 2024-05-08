import java.util.Scanner;

 public class  Nsum{



public static void main(String[] args){


 Scanner scan=new Scanner(System.in);

  System.out.println("Enter the n value");

   int n=scan.nextInt();
   
    int sum=0,i=1;

     while(i<=n){
           sum+=i;
              i++;
     
            }
        
System.out.println(sum);

}

} 
