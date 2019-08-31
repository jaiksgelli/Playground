#include<stdio.h>
int main()
{
int m, n, sum = 0;
scanf("%d %d",&m,&n);
int i, j;
int mat[m][n];
for(i = 0; i < m; i++)
{
for(j = 0; j < n; j++)
scanf("%d",&mat[i][j]);
}
for(i = 0; i < m; i++)
{
for(j = 0; j < n; j++)
{
if (i == 0 || j == 0 || i == n -1 || j == n- 1)
{
sum = sum + mat[i][j];
}

}
}
printf("Sum of boundaries is %d", sum);
}