import  java.util.Scanner;
class Exception
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
try
{
System.out.println("enter the value a");
int a=scan.nextInt();
System.out.println("enter the value b ");
int b=scan.nextInt();
int c;
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("some thing is ranke");
}

}



}