import java.util.Scanner;
public class Prime{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter your number");


int a=scan.nextInt();

boolean b=true;


for(int i=2;i<a-1;i++){

if(a%i==0){

b=false;
break;
}

}

if(b){
System.out.println("The given number is prime number"+a);
}
else{
System.out.println("The given  number is not prime number");
}


}
}
