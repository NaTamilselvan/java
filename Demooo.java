import  java.util.Scanner;
class Demo4
{ 
 void  fun4() throws ArithmeticException 
{
System.out.println("connection establish start 4");
int a,b,c;

Scanner scan =new Scanner(System.in);
try
{

System.out.println("enter the value a");
a=scan.nextInt();
System.out.println("enter the value b");
b=scan.nextInt();
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("invalid");
throw e;
}
finally{

System.out.println("connection establish end 4");
}
}
}
class Demooo
{
public static void main(String[] args)
{
try
{
Demo4 d4=new Demo4();
d4.fun4();
}
catch(ArithmeticException e)
{
System.out.println("invalid");
}
System.out.println("connection establish end ");
}
}