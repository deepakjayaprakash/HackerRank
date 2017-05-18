#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    int k;
    cin >> k;
    for(int i=0;i<n;i++){
        char c=s[i];
        if(isalpha(c)){
            if(islower(s[i]))
                s[i]=(s[i]+k-'a')%26+'a';
            else
               s[i]=(s[i]+k-'A')%26+'A';
        }
            cout<<s[i];
    }

    return 0;
}
