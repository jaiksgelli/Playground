/*
#include<stdio.h>
int max(int a[],int n)
{
  int  high,count=1;
  high = a[0];
  for(int i=0;i<n;i++)
  {
    if(a[i]>high)
    {
      high=a[i];
      count++;
    }
  }
  printf("%d",high);
}
      
int main()
{
  int n,a[10];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  max(a,n);
}
*/
#include<stdio.h>
#include<stdlib.h>
int maximum(int n, int *a)
{
  int high,count=1;
  high=*(a+0);
  for(int i=0;i<n;i++)
  {
    if(*(a+i)>high)
    {
      high=*(a+i);
     // count++;
    }
  }
  return high;
}
int main()
{
  int *a,n;
  scanf("%d",&n);
  a=(int*)malloc(n*sizeof(int));
   for(int i=0;i<n;i++)
  {
    scanf("%d",(a+i));
  }
  
   printf("%d",maximum(n,a));
}


  
