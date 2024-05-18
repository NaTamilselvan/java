package com.thread.programs;

public class Multithreads{


public static void main (String[] args){


  Multithreads r=new Multithreads();


   r.fun();


}


void fun()
{
display();
}

void display(){

System.out.println("Hi i am parent class display method"); 

}
} 
