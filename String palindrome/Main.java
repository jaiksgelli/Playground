#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%s",str);
  int len=0,flag;
  len=strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i] != str[len-i-1])
    {
      flag=1;
      break;
    }
  }
  if(flag == 0)
  {
    printf("Palindrome");
  }
}