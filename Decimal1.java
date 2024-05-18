import java.util.Scanner;
public class Decimal1{

//declare a instance or fields or data memebers


public  static void binaryToDeciaml(int binary){

int deciaml=0,rem=0,i=0;

while(binary>0){

 

 rem=binary%10;

deciaml+=rem*Math.pow(2,i);

binary=binary/10;
 i++;



}

System.out.println(deciaml);


}

public static void main(String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the a value ");

int a =scan.nextInt();

binaryToDeciaml(a);

}


}
