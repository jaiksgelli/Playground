#include<stdio.h>
int main()
{
  int a,b,c,hcf,st;
  scanf("%d%d%d",&a,&b,&c);
  scanf("%d,%d,%d", &a,&b,&c);
  if((a<b&&b<c) || (a>b&&b>c))
    printf("The treasure is in the box which has number %d.\n",b);
  else if((b<a&&a<c) || (b>a&&a>c))
    printf("The treasure is in the box which has number %d.\n",a);
  else
    printf("The treasure is in the box which has number %d.\n",c);
  st=a<b?(a<c?a:c):(b<c?b:c); 
  for (hcf=st;hcf>=1;hcf--)
 {
    if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  	 break;
 } 
 printf("The code to open the box is %d.",hcf);
  
        
}