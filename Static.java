class Static 
{
public static int tamil()

{
System.out.println("without object");
return 5;
}
void tamil2()
{
System.out.println("object");
}


public static void main(String[] args)
{
Static s=new Static();
s.tamil2();
tamil();
}
}