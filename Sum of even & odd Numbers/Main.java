#include<stdio.h>
#include<math.h>
int main()
{
  int a,sum=0,sum1=0,sum2=0;
  float flag1=0,flag2=0;
  float avg1=0;
  float avg2=0;
while(a!=-1)
{    
  	 scanf("%d",&a);
     if(a%2==0)
     {
       sum1=sum1+a;
       flag1++;
     }
     else 
     {
       if(a==-1)
         break;
       sum2=sum2+a;
       flag2++;
     }
      
   }
  printf("%d\n",sum1);
  printf("%d\n",sum2);
  printf("%.2f\n",(sum1/flag1));
  printf("%.2f\n",(sum2/flag2));
}	