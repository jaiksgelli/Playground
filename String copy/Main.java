#include<stdio.h>
#include<string.h>
int main()
{
  char str1[20];
  char str2[20];
  gets(str1);
  strcpy(str2,str1);
  printf("The copied string is %s.",str2);
}