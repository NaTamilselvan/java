public class StaticBlock
{
StaticBlock()
{
System.out.println("I am constructer");
}


static
{
System.out.println("static");
}
static
{
System.out.println("static2");
}
{
System.out.println(" i am non static block");
}
{
System.out.println(" i am non static block2");
}
public static void main(String[] args)
{

System.out.println("hello from main method");
StaticBlock sb=new StaticBlock();
StaticBlock sb1=new StaticBlock();
sb.test();


}
 static void test()
{
System.out.println("test");
}
}