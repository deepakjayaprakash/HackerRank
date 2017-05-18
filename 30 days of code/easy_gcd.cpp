
#include <cmath>

#include <vector>
#include <iostream>


using namespace std;


int main(){
    int n;
    int k;
    cin >> n >> k;
    vector<int> A(n);
    for(int A_i = 0;A_i < n;A_i++){
       cin >> A[A_i];
    }
    int gcd=1;
    for(int i=1;i<=n;i++){
        for(int j=0;j<n;j++){
            if(A[j]%i!=0)
                break;
                else
                    gcd=i;
        }
    }
   // cout<<gcd;
if(gcd==1){
    cout<<"0";
    return 0;
}
     for(int i=k;i>=0;i--){
         if(i%gcd==0)
         {
             cout<<i;
             break;
         }
     }

    return 0;
}
