/*
#include<stdio.h>
int main()
{
  int r,c,r1=1,a[10][10];
  scanf("%d%d",&r,&c);
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  int sum=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum=sum+a[i][j];
     
    }
     printf("The sum of row %d: %d\n",r1,sum);
    sum=0;
    r1++;
  }
  sum=0;
}
*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
  int r,c,r1=1,**a;
  scanf("%d%d",&r,&c);
  a=(int**)malloc(r*sizeof(int*));
  for(int i=0;i<c;i++)
    *(a+i)=(int*)malloc(c*sizeof(int));
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",(*(a+i)+j));
    }
  }
  int sum=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum+=(*(*(a+i)+j));
     
    }
     printf("The sum of row %d: %d\n",r1,sum);
    sum=0;
    r1++;
  }
  sum=0;
}