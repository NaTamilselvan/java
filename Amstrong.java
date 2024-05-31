import java.util.Scanner;
public class Amstrong {

public static void amstrong(int num){

int ams=0,sec=num;
int rem=0;
while(num>0){


rem=num%10;

ams=(ams+(rem*rem*rem));


num=num/10;





}

if(ams==sec) 
  System.out.println("THis number is "+sec+"Amstrong number");
  else
    System.out.println("THis number is "+sec+" Not a Amstrong number");



}


public static void main(String[] args){


 Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number ");

  int a=scan.nextInt();
   
   amstrong(a);

}



}
