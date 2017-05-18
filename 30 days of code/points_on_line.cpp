#include<iostream>
#include <cmath>


using namespace std;


int main(){
    int n;
    cin >> n;
    int a[n],b[n];
    for(int a0 = 0; a0 < n; a0++){
        int x;
        int y;
        cin >> x >> y;
        a[a0]=x;
        b[a0]=y;

    }

    int flag1=1,flag2=1;
    for(int i=0;i<n;i++){
        if(flag1==1 && a[i]!=a[0])
        {
            flag1=0;
        }
         if(flag2=1 && b[i]!=b[0])
        {
            flag2=0;
        }
    }
    if(flag1==1 || flag2==1)
        cout<<"YES";
    else
        cout<<"NO";
    return 0;
}

