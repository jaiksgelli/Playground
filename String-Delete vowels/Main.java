#include<stdio.h>
#include<stdlib.h>
int main()
{
  char a[100];
  int len;
  scanf("%s",a);
  len = strlen(a);
  ///printf("%s",a);
  for(int i=0;i<len;i++)
  {
    if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
    {
      for(int j=i;j<len;j++)
      {
        a[j]=a[j+1];
      }
    }
  }
  printf("%s",a);
}