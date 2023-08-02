#include<iostream>
using namespace std;
const float pi=3.14;
class allarea {
private: float ar1,ar2,ar3;
public:
float area(float n,float b,float h){
 ar1=n*b*h;
}
float area(float r){
 ar2=pi*r*r;
}
float area(float lr,float br) {
 ar3=lr*br;
}
void display(){
 cout<<"\nArea of Triangle: "<<ar1<<endl;
 cout<<"\nArea of Circle: "<<ar2<<endl;
 cout<<"\nArea of Rectangle: "<<ar3<<endl;
}
};
int main(){
float b,h,r,lr,br;
allarea a;
cout<<"\nEnter the Base & Height of Triangle:\n";
cin>>b>>h;
a.area(0.5,b,h);
cout<<"\nEnter the Radius of Circle: \n";
cin>>r;
a.area(r);
cout<<"\nEnter the Length & Breadth of
Rectangle: \n";
cin>>lr>>br;
a.area(lr,br);
a.display();
return 0;
}
