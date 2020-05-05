#include<iostream>
using namespace std;

union emp
{
char name[50];
  int id,age,salary;
  char desig[50];
};
int main()
{
  emp e;
  cout<<"Enter name:";
  cout<<"\nEnter ID:";
  cout<<"\nEnter age:";
  cout<<"\nEnter designation:";
  cout<<"\nEnter Salary:";
  cout<<"\nEmployee Details";
  cin>>e.name;
  cout<<"\nName of the Employee : "<<e.name;
  cin>>e.id;
  cout<<"\nID of the Employee : "<<e.id;
  cin>>e.age;
  cout<<"\nAge of the Employee : "<<e.age;
  cin>>e.desig;
  cout<<"\nDesignation of the Employee : "<<e.desig;
  cin>>e.salary;
  cout<<"\nSalary of the Employee : "<<e.salary;
}