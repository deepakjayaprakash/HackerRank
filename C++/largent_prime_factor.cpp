
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int isprime(int f){
    int count=0;
for(int i=1;i<=f/2;i++){
    if(f%i==0)
        count++;
    if(count>2)
        return 0;
}
return 1;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    int t,a,b,c;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        if(isprime(n)==1){
            cout<<n<<endl;
        continue;
        }
        int l=1;
        for(int f=1;f<=n/2;f++){
            if(n%f==0 && isprime(f)==1){
                   // cout<<f<<endl;
                if(f>l)
                l=f;
        }
        }
        cout<<l<<endl;
    }
 return 0;
}
