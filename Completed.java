abstract class   First
{
abstract void Hello();

}
abstract class Secound extends First
{
abstract void Hello();
}
class Completed extends Secound 
{
void Hello()
{
System.out.println("I am first method");
}
void How()
{
System.out.println("I am secound method");
}
public static void main(String[] args)
{
Completed c=new Completed();
c.Hello();
c.How();
}
}