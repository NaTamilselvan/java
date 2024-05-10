public class ReverseArray{

public static void reverseArray(int[] arr){

  

int[] array=new int[arr.length];

for(int i=0;i<arr.length;i++){

array[i]=arr[arr.length-i-1];


}

System.out.println("the Reverse String");

for(int i:array){
  System.out.println(i);
}


}

public static void main(String[] args){


int[] a={10,20,30,40,50};

System.out.println(a.length);
reverseArray(a);



}




}

