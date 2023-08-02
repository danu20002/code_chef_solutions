#include<stdio.h>
void display(float);
float add(int x,int y);
float sub(int x,int y);
float mul(int x,int y);
float div(int x,int y);
int main(){
 int a,b;
 float ans;
 unsigned char c;
 float(*ptr_op)(int,int);
 float(*ptr_disp)(float);
 ptr_disp=display;
 printf("Enter the two numbers: ");
 scanf("%d %d",&a,&b);
 printf("Enter the arithmatic operation('+','-','*','/'): ");
 scanf(" %c",&c);
 switch(c){
 case'+':ptr_op=add;
 break;
 case'-':ptr_op=sub;
 break;
 case'*':ptr_op=mul;
 break;
 case'/':ptr_op=div;
 break;
 }
 ans=(*ptr_op)(a,b);
 (*ptr_disp)(ans);
 return 0;
}
void display(float s){
 printf("\nAns is :%4.2f",s);
}
float add(int x,int y){
 return x+y;
}
float sub(int x,int y){
 return x-y;
}
float mul(int x,int y){
 return x*y;
}
float div(int x,int y){
 if(y!=0)
 return (float)x/y;
 else
 return 0.0;
}
