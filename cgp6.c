#include<stdio.h>
#include<conio.h>
int main()
{
    int a;
    printf("Enter the year");
    scanf("%d",&a);
    if(a%4==0)
    printf("Entered year is leap year");
    else
    printf("Entered year is not a leap year");
    getch();
    return 0;
}
