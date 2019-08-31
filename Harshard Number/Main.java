#include<stdio.h>
int main()
{
  int a,t,sum=0,digit=0,rem;
  scanf("%d",&a);
  t=a;
  while(t!=0)
  {
    rem=t%10;
    sum=sum+rem;
    t=t/10;
    digit++;
    
  }
  
  
  if(a%sum==0)
    printf("Harshard Number");
  else
    printf("Not Harshard Number");
  
  
  
  
}