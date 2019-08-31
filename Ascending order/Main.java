/*
#include<stdio.h>
#include<stdlib.h>
int sort(int a[],int n)
{
  int temp;
  for(int i=0;i<n;++i)
  {
    for(int j=i+1;j<n;++j)
    {
  		if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;	
        }
    }
  }
}
int main()
{
  int n;
  int a[10];
  scanf("%d",&n);
  //a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  sort(a,n);
  printf("Sorted array is:\n");
  for(int i;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
}
*/
#include<stdio.h>
#include<stdlib.h>
int sort(int *a,int n)
{
  int temp;
  for(int i=0;i<n;++i)
  {
    for(int j=i+1;j<n;++j)
    {
  		if(*(a+i)>*(a+j))
        {
          temp=*(a+i);
          *(a+i)=*(a+j);
          *(a+j)=temp;
        }
    }
  }
}
int main()
{
  int n;
  int *a;
  scanf("%d",&n);
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  sort(a,n);
  printf("Sorted array is:\n");
  for(int i;i<n;i++)
  {
    printf("%d\n",*(a+i));
  }
}
