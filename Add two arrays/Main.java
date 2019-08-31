/*
#include<stdio.h>
int main()
{
int a[10],b[10],c[10];
int n;
scanf("%d",&n);
for(int i=0;i<n;i++)
{
  scanf("%d",&a[i]);
}
for(int i=0;i<n;i++)
{
  scanf("%d",&b[i]);
}
for(int i=0;i<n;i++)
{
  c[i]=a[i]+b[i];
  printf("%d ",c[i]);
}
}
*/

void arraysum(int *a,int *b,int *c,int n)
{
  for(int i=0;i<n;i++)
{
  *(c+i)=*(a+i)+*(b+i);
}
  
}
#include<stdio.h>
#include<stdlib.h>
int main()
{
int *a,*b,*c,n,i;
scanf("%d",&n);
a=(int*)malloc(n*sizeof(int));
b=(int*)malloc(n*sizeof(int));
c=(int*)malloc(n*sizeof(int));

for(i=0;i<n;i++)
{
  scanf("%d",(a+i));
}
for(i=0;i<n;i++)
{
  scanf("%d",(b+i));
}
  arraysum(a,b,c,n);
  for(i=0;i<n;i++)
  {
  	printf("%d ",*(c+i));
  }
}


