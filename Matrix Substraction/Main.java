/*
#include<stdio.h>
int main()
{
  int n1,n2;
  int a1[10][10];
  int a2[10][10];
  int a3[10][10];
  scanf("%d",&n1);
  scanf("%d",&n2);
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n1;j++)
    {
      scanf("%d",&a2[i][j]);
    }
  }
  for(int i=0;i<n2;i++)
  {
    for(int j=0;j<n2;j++)
    {
      scanf("%d",&a1[i][j]);
    }
  }
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      a3[i][j]=a1[i][j]-a2[i][j];
    }
  }
  printf("The Result is:\n");
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n1;j++)
    {
      printf("%d ",a3[i][j]);
    }
    printf("\n");
  }
  
}
*/
#include<stdio.h>
#include<stdlib.h>
int ** memory(int r,int c)
{
  int **a;
  a=(int **)malloc(c*sizeof(int *));
  for(int i=0;i<r;i++)
    *(a+i)=(int*)malloc(r*sizeof(int));
  return a;
}
int main()
{
int **a,**b,r,c,i,j;
scanf("%d %d",&r,&c);
a=memory(c,r);
b=memory(c,r);
for(i=0;i<r;i++){
for(j=0;j<c;j++){
scanf("%d",(*(b+i)+j));
}
}

for(i=0;i<r;i++){
for(j=0;j<c;j++){
scanf("%d",(*(a+i)+j));
}
  
}
  printf("The Result is:\n");
  for(i=0;i<r;i++){
for(j=0;j<c;j++){
printf("%d ",*(*(a+i)+j) - *(*(b+i)+j));
}printf("\n");
}
return 0;
}
