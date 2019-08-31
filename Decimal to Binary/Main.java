#include<stdio.h>
int conv(int n)
{
  if(n==0)
  {
    return 0;
  }
  else
  {
    return ((n%2)+10*(conv(n/2)));
  }
}
            
int main()
{
 int n;
  scanf("%d",&n);
  printf("%d",conv(n));
  
}