public class Strings{


public static void main(String[] args){


String s=new String("tamil");//String in java immutable .means non changable behaviour .String is squence of collectioons characters


//if you tring to any operation to perform String those changes with new object is created if there is no reference thay ellible for garbage collection.


String s2=s.toUpperCase();

String s3=s.toLowerCase(); 


System.out.println(s);

System.out.println(s2);

System.out.println(s3);

System.out.println("String and uppercase new object is created");
System.out.println(s==s2);

System.out.println("String and lowercase no changes ");
System.out.println(s==s3);







}


}
