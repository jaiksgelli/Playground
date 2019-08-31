#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  gets(a);
  for(int i=0;a[i]!='\0';++i)
  {
    while(!((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')||(a[i] == '\0')))
       {
      	for(int j=i;a[j]!='\0';++j)
        {
         a[j]=a[j+1];
        }
      
    }
  }
  printf("%s",a);
         
  
  
}