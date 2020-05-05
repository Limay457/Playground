#include<iostream>
using namespace std;
int main()
{
	int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a <<" and b="<<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
void swap(int a , int b)
{
int  temp;
  a=temp;
  temp=b;
  b=a;
 // return 0;
}