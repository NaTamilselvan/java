class Testuu{


public static void reverseNumber(int a){

int rem=0;

int num2=a;

while(a>0){


   rem=(rem*10)+a%10;
   a=a/10;
           }
System.out.println(rem);

if(rem==num2){

System.out.println("Palindrome");

             }
}
}
public class FF{


public static void main(String[] args){

// Testuu t=new Testuu();

   Testuu.reverseNumber(121);

}

}
