#include<stdio.h>
#include<string.h>
int main()
{
  char str1[20];
  char str2[20];
  gets(str1);
  gets(str2);
  int res=strcmp(str1,str2);
  //printf("%d",res);
  if(res == 0)
  {
  	printf("Strings are same");
  }
}