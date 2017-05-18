#include <cmath>
#include <math.h>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    int t;
    cin >> n >> t;
    vector<int> width(n);
    for(int width_i = 0;width_i < n;width_i++){
       cin >> width[width_i];
    }
    for(int a0 = 0; a0 < t; a0++){
             //cout<<"sfd"<<endl;
        int i;
        int j;
        cin >> i >> j;
        int m=9999;
        for(int k=i;k<=j;k++){
            m=(m<width[k]?m:width[k]);
           //  cout<<m<<endl;
        }
        cout<<m<<endl;
    }

    return 0;
}
