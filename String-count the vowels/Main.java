#include<stdio.h>
int main()
{
 char str[100];
  int len,count=0;
  scanf("%s",&str);
  len = strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i]== 'a'||str[i]== 'e'||str[i]== 'i'||str[i]== 'o'||str[i]== 'u')
       {
         count+=1;
       }
  }
	printf("Number of vowels: %d",count);
  
}
  
      