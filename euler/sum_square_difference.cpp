

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
  long int sum1=n*(n+1)*(2*n+1)/6;
  long int sum2=n*(n+1)/2;
  long int dif=(sum2*sum2)-sum1;
  cout<<dif<<endl;

    }
 return 0;
}
