#include<stdio.h>
#include<stdlib.h>
int i,j;
int main()
{
int **a;
  int **b,n;
scanf("%d",&n);

a=(int**)malloc(n*sizeof(int*));
for(i=0;i<n;i++)
*(a+i)=(int*)malloc(n*sizeof(int));
b=(int**)malloc(n*sizeof(int*));
for(i=0;i<n;i++)
*(b+i)=(int*)malloc(n*sizeof(int));

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
scanf("%d",*(a+i)+j);
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
*(*(b+j)+i)=*(*(a+i)+j);
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d ",*(*(a+i)+j));
}
printf("\n");
}
  printf("Transpose matrix is :\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d ",*(*(b+i)+j));
}
printf("\n");

}
return 0;
}