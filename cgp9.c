#include<stdio.h>
#include<conio.h>
int main()
{
  int N,sum=0;
  clrscr();
  printf("Enter a number: ");
  scanf("%d",&N);
  for(int i=1;i<=N;i++)
  {
    sum=sum+i;
  }
  printf("sum of %d value is:%d \n",N,sum);
  getch();
  return 0;
}
