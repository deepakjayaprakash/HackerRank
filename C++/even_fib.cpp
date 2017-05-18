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
        int n;
        cin>>n;
        a=1;
        b=2;
        c=0;
        int sum=2;
        while(c<=n){
            c=a+b;
          // cout<<c<<endl;
            a=b;
            b=c;
            if(c%2==0 && c<n)
                sum+=c;
        }
       cout<<sum<<endl;

    }
 return 0;
}
