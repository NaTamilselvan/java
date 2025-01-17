interface product
{
void compound();
void layer();

}
class Compound  
{
 public void  maintance() 
{
System.out.println("they compound");
} 
}
class Eginnovations extents Compound implements product
{
public void compound()
{
System.out.println("maintanced ");
}
public void layer()
{
System.out.println("maintanced the policy");
}
public void  maintance() 
{
System.out.println(" overwtitten"); 
}

public static void main(String[] args){
{
Eginnovations  eg =new Eginnovations ();
e.compound ();
e.layer();
e.maintance();
}


}

