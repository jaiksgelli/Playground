#include<stdio.h>
#include<stdlib.h>
int removeDuplicate(int n, int *a)
{
  for(int i = 0; i < n; i++)
    {
        for(int j = i+1; j < n;n-- )
        {
            if(a[j] == a[i])
            {
                for(int k = j; k < n; k++)
                {
                    a[k] = a[k+1];
                }
                
            }
            else
            {
                j++;
            }
        }
    }
 
  for(int i=0;i<n;i++)
  {
    printf("%d\n",*(a+i));
  }
          
}

int main()
{
  int *a,n;
  scanf("%d",&n);
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  removeDuplicate(n,a);
}
  