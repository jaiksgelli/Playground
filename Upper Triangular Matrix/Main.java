/*
#include <stdio.h>

int main()
{
int n;
scanf("%d",&n);
int flag = 0;
int mat[n][n];
int i, j;
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
scanf("%d",&mat[i][j]);
}

for (i = 1; i < n; i++)
for (j = 0; j < i; j++)
if (mat[i][j] != 0)
flag = 0;
else
flag = 1;

if (flag == 1)
printf("Upper triangular matrix");
else
printf("Not an Upper Triangular Matrix");
return 0;
}
*/

#include <stdio.h>
#include<stdlib.h>
int main()
{
int n;
scanf("%d",&n);
int flag = 0;
int **mat;
mat=(int**)malloc(n*sizeof(int*));
 for(int i=0;i<n;i++)
*(mat+i)=(int*)malloc(n*sizeof(int));
int i, j;
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
scanf("%d",*(mat+i)+j);
}

for (i = 1; i < n; i++)
for (j = 0; j < i; j++)
if (*(*(mat+i)+j) != 0)
flag = 0;
else
flag = 1;

if (flag == 1)
printf("Upper triangular matrix");
else
printf("Not an Upper Triangular Matrix");
return 0;
}
