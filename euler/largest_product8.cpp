


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    int t,a,b,c;
    cin>>t;
    for(int i=0;i<t;i++){
        string n;int k,dig;
        cin>>dig>>k;
        cin>>n;
        int num[dig];
        for(int j=0;j<dig;j++)
        num[j]=atoi((char*)n[j]);

        for(int x=1;x<(dig-k)+1;x++){
                int p=1;
        for(int y=x;y<k+x;y++)
            p=p*num[y];

             cout<<p;
        }

    }
 return 0;
}
