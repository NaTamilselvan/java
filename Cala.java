package mypack2;
interface calculation
{
void add();
void sum();
}
class Cala implements calculation 
{
int a,b,c;
public void add()
{
a=10;
b=20;
c=a+b;
System.out.println(c);

}
public void sum()
{
a=10;
b=10;
c=a-b;
System.out.println(c);

}
}