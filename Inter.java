interface product 
{
void  add();
}
interface compound   implements Product 
{
void sum();
}
class Inter implemwnts compound 
{
void add()
{

}
void sum()
{

}
public static void main(String[] args )
{
Inter i =new Inter ();
i.sum();
i.add();
}
}
