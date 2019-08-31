/*
#include<stdio.h>
int main()
{
 int n;
  int a[10];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
  
}
*/
#include<stdio.h>
int main()
{
  int a[50],i,n;
int *p=a;
scanf("%d",&n);
for(i=0;i<n;i++)
scanf("%d",p+i);

for(i=0;i<n;++i)
printf("%d\n",*(p+i));
    
}
  