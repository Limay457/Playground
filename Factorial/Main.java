#include<iostream>    
using namespace std;      
int main()    
{    
int factorial(int);    
int fact,value;    
   
cin>>value;    
fact=factorial(value);    
cout<<"The factorial of"<<" "<<value<<" "<<"is"<<" "<<fact;    
return 0;    
}    
int factorial(int n)    
{    
if(n<0)    
return(-1); /*Wrong value*/      
if(n==0)    
return(1);  /*Terminating condition*/    
else    
{    
return(n*factorial(n-1));        
}    
} 