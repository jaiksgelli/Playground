#include<stdio.h>
int pow(int n,int p)
{
  if(p==0)
    return 1;
  else
  {
    return(n*pow(n,p-1));
  }
}

int main()
{
  int n,p;
  scanf("%d%d",&n,&p);
  printf("%d",pow(n,p));
 
}