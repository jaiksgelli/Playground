/*
#include<stdio.h>
int main()
{
  float s1,s2,s3,d1,d2,d3,sh1,sh2,sh3,tot1,tot2,tot3;
  scanf("%d%d%d%d%d%d%d%d%d",&s1,&d1,&sh1,&s2,&d2,&sh2,&s3,&d3,&sh3);
  d1=d1/100;
  d2=d2/100;
  d3=d3/100;
  tot1=(s1*d1)+sh1;
  tot2=(s2*d2)+sh2;
  tot3=(s3*d3)+sh3;
  printf("In Flipkart: Rs.%f\n",tot1);
  printf("In Flipkart: Rs.%f\n",tot2);
  printf("In Flipkart: Rs.%f\n",tot3);
  
  if(tot1>tot2)
  {
    if(tot1>tot3)
    {
      printf("He will prefer Flipkart");
    }
    else if(tot2>tot3)
    {
      printf("He will prefer Snapdeal");
    }
  }
  else
  {
    printf("He will prefer Amazon");
  }  
}
*/
#include<stdio.h>
int main()
{
    float a,b,c,d,e,f,g,h,i,flipkart,snapdeal,amazon;
    float dis=0;
    scanf("%f%f%f%f%f%f%f%f%f",&a,&b,&c,&d,&e,&f,&g,&h,&i);
    dis=(b/100)*a;
    flipkart = (a-dis) + c;
    printf("In Flipkart: Rs.%d\n",(int)flipkart);
    dis = (e/100)*d;
    snapdeal = (d-dis) + f;
    printf("In Snapdeal: Rs.%d\n",(int)snapdeal);
    dis = (h/100)*g;
    amazon = (g-dis) + i;
    printf("In Amazon: Rs.%d\n",(int)amazon);
    if(flipkart <snapdeal && flipkart < amazon)
        printf("He will prefer Flipkart");
    else if(snapdeal < amazon && snapdeal < flipkart)
        printf("He will prefer Snapdeal");
    else 
        printf("He will prefer amazon");
    return 0;
}
