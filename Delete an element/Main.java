/*
#include <stdio.h>

int main()
{
int array[100], position, c, n;
scanf("%d", &n);
for (c = 0; c < n; c++)
{
	scanf("%d", &array[c]);
}
scanf("%d", &position);

if (position >= n+1)
printf("\nDeletion not possible.\n");
else
{
for (c = position - 1; c < n - 1; c++)
array[c] = array[c+1];

printf("Array after deletion is:\n");

for (c = 0; c < n -1; c++)
printf("%d\n", array[c]);
}

return 0;
}
*/
#include<stdio.h>
#include<stdlib.h>
void delete(int n,int *a,int l);
int main()
{
int *a,n,i,l;
scanf("%d",&n);
a=(int*)malloc(sizeof(int)*n);
for(i=0;i<n;i++)
{
scanf("%d",(a+i));
}
scanf("%d",&l);
delete(n,a,l);

}
void delete(int n,int *a,int l)
{
int i,j;
if(l<=n)
{
for(i=l-1;i<n;i++)
{
j=i+1;
*(a+i)=*(a+j);
}
printf("Array after deletion is:\n");
for(i=0;i<n-1;i++)
{
printf("%d\n",*(a+i));
}
}
else
{
printf("Invalid Input");
}
}