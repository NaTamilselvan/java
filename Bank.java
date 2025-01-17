class Bank{

private  int minbalance=2500;


public int getminbalance()
{
return this.minbalance;
}
public void setminbalance(int value)
{
if(value>2500)
{
this.minbalance=value;
}
}



}