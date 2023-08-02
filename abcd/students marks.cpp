#include<iostream>
#include<iomanip>
using namespace std;
class Student
{
private: char name[30],grade;
int usn;
float mcmos,mcplus, mapp,
total,percentage;
public:
Student()
{ cout<<"\nIn Student Constructor";
name[0]='\0';
usn = 0;
grade='\0';
mcmos=mcplus=mapp=total=percentage= 0.0;
}
void getdata()
{
cout<<endl<<"Enter Name:\n";
cin>>name;
cout<<"Enter USN:";
cin>>usn;
cout<<endl<<"Enter marks in CMOS:";
cin>>mcmos;
cout<<endl<<"Enter marks in C++:";
cin>>mcplus;
cout<<endl<<"Enter marks in APP:";
cin>>mapp;
}
void calculate()
{
total = mcmos+mcplus+mapp;
percentage = total/300*100;
}
void showStudent()
{
cout<<endl<<setprecision(5)<<name<<"\t"<<usn
<< "\t"<<mcmos<<"\t"<<mcplus<< "\t
"<<mapp<<"\t";
cout<<setprecision(5)<<total<<"\t"<<percentage<
<"\t "<<grade;
}
void findGrade()
{
if(percentage>= 80)
grade='A';
else if(percentage>= 70 && percentage < 80)
grade='B';
else if(percentage>= 60 && percentage < 70)
grade='C';
else
grade='F';
}
~Student()
{ cout<<"\n\nIn the Student Destructor\t";
cout<<"Year 2020-21"<<endl;
}
};
int main()
{
int i,n;
cout<<"Enter the number of students : \n";
cin>>n;
Student a[n];
for(i=0;i<n;i++)
{
a[i].getdata();
a[i].calculate();
a[i].findGrade();
}
cout<<"\nName\tUSN\tCMOS\tCPP\tAPP
Total\tPercentage\tGrade"<<endl;
for (i=0;i<n;i++)
{
a[i].showStudent();
}
return 0;
}
