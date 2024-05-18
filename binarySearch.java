import java.util.Scanner;
public class binarySearch{

//declare a instance or fields or data memebers


public  static void binarySearch(int a[],int key){

//int len=a.length;

int first=0,last=a.length-1;

while(first<=last){

int mid=a.length/2;

if(a[mid]==key){

System.out.println(mid);
break;

}

if(a[mid]<key){

first =mid+1;

last =a.length-1;



}

if(a[mid]>key){

first =0;

last =mid-1;

}





}


}

public static void main(String[] args){

//Scanner scan=new Scanner(System.in);

//System.out.println("Enter the a value ");

int[] a ={10,20,30,40,50,60,70,80,90};


binarySearch(a,80);

}


}
