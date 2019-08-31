/*
#include <stdio.h>

void distict_elements(int a[], int n);
int main()
{
int size_array, i, arr[20];
scanf("%d", &size_array);
for(i=0; i<size_array; i++)
{
scanf("%d", &arr[i]);
}
distict_elements(arr, size_array);
return 0;
}
void distict_elements(int a[], int n)
{
int i, j,count=0;
for (i=0; i<n; i++)
{
for (j=0; j<i; j++)
{
if (a[i] == a[j])
break;
}
if (i == j)
  count++;

}
  printf("There are %d distinct elements in the array.",count);
}
*/
#include <stdio.h>

void distict_elements(int *a, int n);
int main()
{
int size_array, i, *arr;
scanf("%d", &size_array);
arr=(int*)malloc(size_array*sizeof(int));
for(i=0; i<size_array; i++)
{
scanf("%d", arr+i);
}
distict_elements(arr, size_array);
return 0;
}
void distict_elements(int *a, int n)
{
int i, j,count=0;
for (i=0; i<n; i++)
{
for (j=0; j<i; j++)
{
if (a[i] == a[j])
break;
}
if (i == j)
  count++;

}
  printf("There are %d distinct elements in the array.",count);
}
