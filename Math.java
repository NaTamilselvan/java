abstract class  Addtion
{
abstract  void sum();
}
abstract class subtraction
{ 
 abstract  void sub();
}
class Math extends Addtion ,subtraction
{  void sum()
{

}
void sub ()
{

}

public static void main(String[] args)
{
Math m=new Math();
m.sum();
m.sub();

}

}