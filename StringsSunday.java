public class StringsSunday{


public static void main(String[] args){


int a=10; //-2147483648 to 2147483648  

byte b=12;//-128 to +127

short aa=10;//0 t0 65535  32718 to 32717   32768+32767      65535

long k=9942024471l;


System.out.println(b);


System.out.println(aa);


System.out.println(k);

System.out.println(a);


 Integer y=new Integer(10);


System.out.println("This b "+y.hashCode());

System.out.println("This b1 "+y.toString());

 Byte B=new Byte(b);

System.out.println("This b "+B.hashCode());

System.out.println("This b1 "+B.toString());

System.out.println(y);


}

}


