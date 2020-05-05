#include <iostream>
#include <string>
const int MAX_NAME_SIZE = 30;
int main () {
	std::string name(' ', MAX_NAME_SIZE);
	name.reserve(MAX_NAME_SIZE);
	
  if(std::cin.getline(const_cast<char *>(name.data()), MAX_NAME_SIZE))
	
        // optionally you could use the gcount function here to downsize the string
	std::cout << "Caption eligible for the contest";
  else
    std::cout << "Caption not eligible for the contest";
	return 0;
}