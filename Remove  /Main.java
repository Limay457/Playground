#include <bits/stdc++.h>
#include<string>
using namespace std; 
  
string removeWord(string str, string word)  
{  
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
        
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
   
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
  

    return str; 
} 
  
// Driver Code 
int main(int argc, char const *argv[])  
{ 
    // Test Case 1: 
    // If the word is in the middle 
    string string1;
    getline(cin,string1);
    string word1 = "the"; 
  
  
    // Test case 1 
    cout<< removeWord(string1, word1) << endl; 
  
    
    return 0; 
}