import java.util.Scanner;
public class LCM{

public static void Lcm(int num1,int num2){

int max=0;

max=(num1>num2?num1:num2);
   System.out.println(max);

  //boolean b=true;  

  while(true){
       if(max%num1==0 && max%num1==0){
           System.out.println("The lcm is "+max);
            
             break;
           
               }
         else{
  
           max++;

                }
             }

     }

public static void main(String[] args){


Scanner scan=new Scanner(System.in);

System.out.println("Enter the number ");

 int num1=scan.nextInt();

 int num2=scan.nextInt();

Lcm(num1,num2);



}

}
