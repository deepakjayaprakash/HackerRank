#include <iostream>
#include <sstream>
#include <string>

using namespace std;

int main()
{
   string s;
   cin>>s;
    istringstream iss(s);


        string sub;
        iss >> sub;

        int h=atoi(sub.c_str());

         string sub;
        iss >> sub;

        int m=atoi(sub);
         string sub;
        iss >> sub;

        int sec=atoi(sub);

        cout << "Substring: " << sub << endl;



}
