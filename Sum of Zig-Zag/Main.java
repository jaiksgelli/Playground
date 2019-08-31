#include<stdio.h>
int main()
{
  int m, n, sum = 0, row1 = 0, col_n = 0, diag = 0;
  int mat[10][10];
  scanf("%d%d",&m,&n);
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
  
  for(int i=0;i<m;i++)
  {
    sum+=mat[0][i];
  }
      for(int i=1;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i+j==m-1)
            sum+=mat[i][j];
        }
      }
  
  
  for(int j=1;j<n;j++)
    sum+=mat[m-1][j];
       	 


  printf("Sum of Zig-Zag pattern is %d",sum);

  
}