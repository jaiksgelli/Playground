/*
#include<stdio.h>
#define N 3

int check_lower_triangular_matrix(int mat[N][N])
{
int i, j;
for (i = 0; i < N; i++)
for (j = i + 1; j < N; j++)
if (mat[i][j] != 0)
return 0;
return 1;
}

int main()
{
int mat[N][N];
int i, j;
for(i = 0; i < N; i++)
{
for(j = 0; j < N; j++)
scanf("%d",&mat[i]);
}

if (check_lower_triangular_matrix(mat))
printf("Lower triangular matrix");
else
printf("Not a Lower Triangular Matrix");
return 0;
}
*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
int **a,n,i,j,check=0;
scanf("%d",&n);

a=(int**)malloc(n*sizeof(int*));
for(i=0;i<n;i++)
*(a+i)=(int*)malloc(n*sizeof(int)); 
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
scanf("%d",*(a+i)+j);
}
}

for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(*(*(a+i)+j)!=0)
{
check++;
break;
}

}
}
if(check!=0)
printf("Not a lower triangular matrix");
else
printf("Lower triangular matrix");
}