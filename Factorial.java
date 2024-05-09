import java.util.Scanner;

public class Factorial{


public static void main(String[] args){

int ans=1;

  Scanner scan=new Scanner(System.in);
  
System.out.println("Enter the factorial number");

int fact=scan.nextInt();




for(int i=1;i<=fact;i++){

 ans*=i;

}

System.out.println("The factorial number is "+ans);




}


}
