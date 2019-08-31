#include<stdio.h>
#include<math.h>
int main()
{
  int n,start=1;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(int i=2;i<n+2;i++)
  {
    printf("%d ",start);
    start = pow(i,i);
  }
    
 
    
}