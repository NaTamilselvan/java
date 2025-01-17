#include<stdio.h>
#include<conio.h>
 int main()
 {
  int userInput,division,multiplication,check,check2;
  printf("Enter the userInput");
  scanf("%d",&userInput);
  division=userInput/2;
  multiplication=division*2;
  check=multiplication-userInput;
  printf("hi");
  
  if(check==0)
  {
  printf("The number is even");
  }
  else
  {
  printf("The number is odd");
  }
  printf("another method");
  check2=userInput%2;
  if(check2==0)
  {
  printf("The Number is even");
  }
  else
  {
  printf("The number is odd");
  }
 
 
 
 }

