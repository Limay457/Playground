#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s;
   cout<<"\nStudent Details"<<endl;
  cin.get(s.name,50);
 cout<<"Name: "<<s.name;
  cin>>s.roll;
  cout<<"\nRoll: "<<s.roll;
  cin>>s.marks;
  cout<<"\nMarks: "<<s.marks;
  
}