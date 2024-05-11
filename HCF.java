import java.util.Scanner;

public class HCF{

 static void findHcf(int a,int b){

int min=(a<b)?a:b;

System.out.println(min);

while(true){

if((a%min==0)&&(b%min==0)){

      System.out.println(min);
      break;
                     }

   
            min--;
          }


}



public static void main(String[] args){

   Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter the  a value");

    int a=scan.nextInt();

   System.out.println("Enter the  b value");

    int b=scan.nextInt();
         findHcf(a,b);  

}


}
