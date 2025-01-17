import  java.util.Scanner;
class Demo4
{ 
 void  fun4()
{
System.out.println("connection establish start 4");
int a,b,c;

Scanner scan =new Scanner(System.in);
System.out.println("enter the value a");
a=scan.nextInt();
System.out.println("enter the value b");
b=scan.nextInt();
c=a/b;
System.out.println(c);


System.out.println("connection establish end 4");
}
}
class Demo3
{

 void fun3()
{
try
{
System.out.println("connection establish start 3");
Demo4 d4=new Demo4();
d4.fun4();
}
catch( ArithmeticException e)
{
System.out.println("invaild password");
}
System.out.println("connection establish end 3");
}


}
class Demo2
{
 void  fun2()
{
System.out.println("connection establish start 2");
Demo3 D3=new Demo3();
D3.fun3();
System.out.println("connection establish end 2");
}

}
class Demo
{
public static void main(String[] args)
{
System.out.println("connection establish start 1");
Demo2 d2=new Demo2();
d2.fun2();
System.out.println("connection establish end ");

}
}