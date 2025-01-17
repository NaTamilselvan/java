import java.util.Scanner;
class Exceptions
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
try{
System.out.println("enter the A value");
int a=scan.nextInt();
System.out.println("enter the B value");
int b=scan.nextInt();
int c=a/b;
System.out.println(c);
System.out.println("enter range of the array");
int r=10;
int arr[]=new int[r];
System.out.println("enter the ele  value");

int ele=scan.nextInt();
System.out.println("enter the index ");
int index=scan.nextInt();
arr[index]=ele;
System.out.println(arr[index]=ele);
}
catch(ArithmeticException e)
{
System.out.println("The number zero is not accesble");
}

catch(ArrayIndexOutOfBoundsException e)//InputMismatchException
{
System.out.println("out of value");
}
catch(InputMismatchException e)
{
System.out.println("elements value boolean");
}

//ArrayIndexOutOfBoundsException

 



}
}