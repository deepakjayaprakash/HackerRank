#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int l,u,count=0;
        cin >> l>>u;
        for(int i=l;i<=u;i++){
            float r=sqrt(i);
             // cout<<r<<"   "<<ro<<"   "<<i<<endl;
            if(r==ro){
                 //cout<<r<<"   "<<ro<<endl;
                 count++;
            }

        }
        cout<<count<<endl;
    }
    return 0;
}
