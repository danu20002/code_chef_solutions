#include<iostream>
using namespace std;
class COMPLEX
{
int re,im;
public:
void get()
{
cin>>re>>im;
}
void display()
{
cout<<re<<"+"<<im<<"i";
}
void add(COMPLEX c1,COMPLEX c2)
{
re=c1.re+c2.re;
im=c1.im+c2.im;
}
};
int main()
{
COMPLEX c1,c2,c3;
cout<<"\nEnter 1st complex no. as real and
imaginary part: \n";
c1.get();
cout<<"\nEnter 2nd complex no as real and
imaginary part: \n";
c2.get();
cout<<"\n\nThe 1st complex no. is : ";
c1.display();
cout<<"\nThe 2nd complex no. is : ";
c2.display();
c3.add(c1,c2);
cout<<"\n\nThe resultant complex no. is : ";
c3.display();
return 0;
}
