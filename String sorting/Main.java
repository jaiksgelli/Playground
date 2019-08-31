#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%s",str);
  int l,tmp;
  l=strlen(str);
  for(int i=0;i<l-1;i++)
  {
    for(int j=i+1;j<l;j++)
    {
      if(str[i]>str[j])
      {
        tmp=str[i];
        str[i]=str[j];
        str[j]=tmp;
      }
    }
  }
  printf("The sorted string is %s", str);
  
  
}