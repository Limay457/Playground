# include <iostream>
using namespace std;

int main()
{
	string firstStr,secondStr;

	//cout << "Please enter the first strings -> ";
  getline(cin,firstStr);
	//cout << "Please enter the second strings -> ";
  getline(cin,secondStr);

	int i = firstStr.compare(secondStr);

	if(i==0)
	{
	    cout <<"It is correct"<< endl;
	}else cout <<"It is wrong"<< endl;

	return 0;
}