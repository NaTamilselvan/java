public class Demosss{


public static void main(String[] args){

int a=10;//primitivetype data not a object .


System.out.println(a);

 Integer  i =new Integer(a);

   System.out.println(i);

Integer b=a;

System.out.println(b);

int d=i;

System.out.println(d);


 Integer i2=new Integer(45);

  i2.intValue();

System.out.println(i2);


b.intValue();

}


}
