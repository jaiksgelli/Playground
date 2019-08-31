/*
#include<stdio.h>
int main()
{
  int n1,n2;
  int a1[10],a2[10];
  int sum1=0,sum2=0,tot1=0,tot2=0;
  scanf("%d%d",&n1,&n2);
  for(int i=0;i<n1;i++)
  {
    scanf("%d",&a1[i]);
  }
  for(int i=0;i<n2;i++)
  {
    scanf("%d",&a2[i]);
  }
 for(int i=0;i<n1;i++)
 {
   sum1=sum1+a1[i];
 }
   for(int i=0;i<n2;i++)
 {
   sum2=sum2+a2[i];
 }
  
 if(sum1==sum2&&n1==n2)
   printf("Same");
  else
    printf("Not Same");
}
*/
#include<stdio.h>
#include<stdlib.h>
 int *a,*b,n,p;
  int sum1=0,sum2=0;
int findsame(int *a,int*b,int n,int p)
{
   for(int i=0;i<n;i++)
 {
   sum1=sum1+*(a+i);
 }
   for(int i=0;i<p;i++)
 {
   sum2=sum2+*(b+i);
 }
   if(sum1==sum2 && n==p)
   printf("Same");
  else
    printf("Not Same");
}
  
  
int main()
{
 
  scanf("%d%d",&n,&p);
  a=(int*)malloc(sizeof(int));
  b=(int*)malloc(sizeof(int));
  for(int i=1;i<=n;i++)
  {
  scanf("%d",a+i);
  }
  for(int i=1;i<=p;i++)
  {
  scanf("%d",b+i);
  }
  findsame(a,b,n,p);
  
}
  