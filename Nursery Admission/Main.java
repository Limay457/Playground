#include <iostream>
using namespace std;

int main()
{
    string str;
  getline(cin,str);

    // you can also use str.length()
    cout << "The number of letters in the name is " << str.size();

    return 0;
}