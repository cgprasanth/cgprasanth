#include<stdio.h>
#include<conio.h>
int main()
{
int a,b,c;
clrscr();
scanf("%d%d%d",&a,&b,&c);
if(a>=b && b>=c)
printf("%d is biggest number",a);
else if(b>=a && a>=c)
printf("%d is biggest number",b);
else printf("%d is biggest number",c);
getch();
return 0;
}
