import java.util.Scanner;
public class Addtiondigit{



public static void addd(int num ){

int total=0;

while (num>9){

while(num>0){

int rem=0;
 
rem=num%10;

total=total+rem;

num=num/10;

}
System.out.println(total);
}

System.out.println(total);

}

public static void main(String[] args){

 Scanner scan=new Scanner(System.in);

System.out.println("Enter the number");
int a=scan.nextInt();
   
addd(a);

}


}





