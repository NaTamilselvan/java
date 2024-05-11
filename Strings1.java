public class Strings1{

public static void main(String[] args){


String s="Java";//String has special area to store in heap 

String s1="java";//not new keyowrd use the memory allocated in scp area.


if(s==s1){
System.out.println("Refernce equal");

}
else {
System.out.println("Refernce not equal");
}


if(s.equals(s1)){
System.out.println("values  are  equal");
}
else{
System.out.println("values  not  equal");
}


if(s.equalsIgnoreCase(s1)){
System.out.println("values  are  equal");
}
else{
System.out.println("values  not  equal");
}



String s2="java";


String s3="python";


String s4="java"+"python";

String s5=s2+s3;


if(s4==s5){
System.out.println("Refernce equal");

}
else {
System.out.println("Refernce not equal");
}


if(s4.equals(s5)){
System.out.println("values  are  equal");
}
else{
System.out.println("values  not  equal");

}

System.out.println(s4.hashCode());

System.out.println(s5.hashCode());


String s6="Tamil  ";

System.out.print(s6.trim());

System.out.print(s6);



}

}
