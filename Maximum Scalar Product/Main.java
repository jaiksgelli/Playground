#include<stdio.h>
int sort_des(int arr[], int n)
{
int i,j;
for (i = 0; i < n; i++)
{
for (j = i + 1; j < n; j++)
{
if (arr[i] < arr[j])
{
int a = arr[i];
arr[i] = arr[j];
arr[j] = a;
}
}
}
}

int main()
{
int n;
scanf("%d",&n);
int arr1[n], arr2[n];
int i;
for(i = 0; i < n ; i++)
{
scanf("%d",&arr1[i]);
}
for(i = 0; i < n ; i++)
{
scanf("%d",&arr2[i]);
}

sort_des(arr1, n);
sort_des(arr2, n);
int sum = 0;
for(i = 0; i < n ; i++)
{
sum = sum + (arr1[i] * arr2[i]);
}
printf("%d",sum);
return 0;
}