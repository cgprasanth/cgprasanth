#include<stdio.h>
#include<conio.h>
int main()
{
 int n,b,count=0;
 clrscr();
 printf("Enter a number: ");
 scanf("%d",&n);
 while(n!=0)
 {
  b=n/10;
  n=b;
  count++;
 }
 printf("number of digits in given number is:%d",count);
 getch();
 return 0;
}
