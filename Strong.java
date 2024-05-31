import java.util.Scanner;

public class Strong {

public static void strong (int num) {


int str=0,sec=num;

int rem=0;


while(num>0){

int fact=1;

rem=num%10;

while(rem>0){

     fact*=rem;

    rem--;
}

System.out.println("The factorial number"+fact);

str+=fact;
num=num/10;

}

if(str==sec) 

  System.out.println("THis number is "+sec+"strong number");

  else

    System.out.println("This number is "+ sec +" Not a strong number");



}


public static void main(String[] args){


 Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number ");

  int a=scan.nextInt();
   
   strong(a);

}



}
