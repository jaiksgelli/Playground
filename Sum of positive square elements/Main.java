#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int sumPositive(int n,int *a)
{
int i,sum=0,m;
for(i=0;i<n;i++)
{
m=sqrt(*(a+i));
if(pow(m,2)==*(a+i))
{
sum+=*(a+i);
}
}
return sum;
}
int main()
{
int i,*a,n;
scanf("%d",&n);
a=(int*)malloc(n*sizeof(int));
for(i=0;i<n;i++)
{
scanf("%d",a+i);
}
printf("%d",sumPositive(n,a));
return 0;
}