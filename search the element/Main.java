#include <stdio.h>

int main()
{
int array[100], ele, c, n;

//printf(“Enter the number of elements of the array : “);
scanf("%d", &n);

//printf(“\nInput the array elements : “);

for (c = 0; c < n; c++)
scanf("%d", &array[c]);

//printf(“\nEnter element : “);
scanf("%d", &ele);
for(c = 0; c < n ; c++)
{
if(array[c] == ele)
{
printf("%d",c+1);
}
}

return 0;
}