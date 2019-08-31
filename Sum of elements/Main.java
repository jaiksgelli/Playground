#include<stdio.h>
int i,n,sum;
  int *a;
int sumOfElements(int n,int *a)
{
	for (int i = 0; i < n; i++)
  {
	sum = sum + *(a + i);
  }
  return sum;
}
  
int main()
{
  scanf("%d",&n);
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  
  printf("%d",sumOfElements(n,a));
  
}