class userexception extends Exception
{
public String getMessage()
{
return "wrong paasword ,try one more ";
}
}
class Check
{
int accountnumber=1111;
int password=8778;
int ac;
int p;
  public void Input()
{
System.out.println("enter the Atm password ");
ac=scan.nextInt();
System.out.println("enter the password ");
p=scan.nextInt();
}
public void  validity()  throws Exception
{
if(accountnumber ==ac && password==p)
{
System.out.println("take your case");
}
else
{
userexception ue=new userexception();
System.out.println(ue.getmessage());
throw ue;

}
}



}


}










class Bank
{
void intitate()
{
try{

 Check c=new Check();
c. Input();
c. validity();
}
catch(Exception e)
{
try{
c. Input();
c. validity();
}
catch( exception c)
{
try{
c. Input();
c. validity();
}
catch(Exception v)
{

System.out.println ("they time out try for after 30 mintue");
}
}
}
}

}




class Active 
{
public static void main(String[] args)
{
Bank b=new Bank();
b.intitate();
}
}