#include<stdio.h>
#include<stdlib.h>
void insert(int n1, int *a, int l, int e)
{
int i;
for(i=0;i<l-1;i++)
{
printf("%d\n",*(a+i));
}
printf("%d\n",e);
for(i=l-1;i<n1;i++)
{
printf("%d\n",*(a+i));
}
}

int main()
{
int *a,n,i,l,e;
scanf("%d",&n);
a=(int*)malloc(n*sizeof(int));
for(i=0;i<n;i++)
{
scanf("%d",a+i);
}
scanf("%d",&l);
if(l<=n)
{
scanf("%d",&e);
printf("Array after insertion is:\n");
insert(n,a,l,e);
}
else
{
printf("Invalid Input");
}
return 0;
}