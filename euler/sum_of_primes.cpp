



#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int isprime(int f){
    int count=0;
for(int i=1;i<=f;i++){
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
        int sum=0;
        for(int i=2;i<=n;i++){
                int count=0;
               // cout<<i<<endl;
            if(isprime(i))
                sum+=i;

        }

cout<<sum;
    }
 return 0;
}
