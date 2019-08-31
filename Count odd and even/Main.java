/* 
#include <stdio.h>
 
 int count(int a[],int n)
 {
 	int i,even=0,odd=0;
    for(i=0; i<n; i++)
    {
          if(a[i]%2==0)
          even++;
          else
          odd++;	           
    }
     printf("Odd: %d\n",odd);
     printf("Even: %d",even);
 }
int main()
{
    int a[1000],i,n,sum;
    scanf("%d", &n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    count(a,n);  
}
*/
#include <stdio.h>
#include<stdlib.h>
int even=0,odd=0;
 void count_even(int *a,int n)
 {
 	int i;
    for(i=0; i<n; i++)
    {
          if(*(a+i)%2==0)
          {
          even++; 
          }   	 
    }
   return even;
 }
void count_odd(int *a,int n)
 {
 	int i;
    for(i=0; i<n; i++)
    {
          if(*(a+i)%2!=0)
          {
          odd++;
          }     	 
    }
   return odd;   
 }
int main()
{
    int *a,i,n,sum;
    scanf("%d", &n);
  	a=(int*)malloc(n*sizeof(int));
    for(i=0; i<n; i++)
    {
        scanf("%d",a+i);
    }
  	/*for(i=0; i<n; i++)
    {
        printf("%d ",*(a+i));
    }
  */
    count_odd(a,n);
  	count_even(a,n);
  
  	printf("Odd: %d\n",odd);
    printf("Even: %d",even);
}