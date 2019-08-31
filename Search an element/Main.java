/*
#include<stdio.h>
int main()
{
  int a[10],n,ele,count=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&ele);
  for(int i=0;i<n;i++)
  {
    if(ele==a[i])
      count++;
  }
      if(count==1)
  		printf("%d is present in the array",ele);
    else
      printf("%d is not present in the array",ele);
  }*/

#include<stdio.h>
#include<stdlib.h>
int i,l;
int search(int ,int *,int);
int main()
{
int n,m;
scanf("%d",&n);
int *a;
 a=(int*)malloc(n*sizeof(int));
  
for(i=0;i<n;i++)
{
scanf("%d",a+i);
}
scanf("%d",&m);
search(n,a,m);

return 0;
}
int search(int n,int *a,int m)
{
for(i=0;i<n;i++)
{
if(m==*a+i)
{
l=1;
break;
}
}
if(l==1)
{
printf("%d is present in the array",m);

}
else
{
printf("%d is not present in the array",m);
}
}
  
  
