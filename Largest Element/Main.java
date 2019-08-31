#include<stdio.h>
#include<stdlib.h>
int main()
{
  int n;
  scanf("%d",&n);
  int *a;
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  int max=*(a+0); 
  printf("%d",maximum(n,a,max));
}
int maximum(int n,int *a,int max)
{
  if(n==0)
    return max;
  if(n>1)
  {
   if(*(a+n-1)>max)
   {
     max=*(a+n-1);
   }
  }
  return maximum(n-1,a,max);
}
  
