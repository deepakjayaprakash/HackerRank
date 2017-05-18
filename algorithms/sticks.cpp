
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin >> n;
   std::vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    int flag=1,m=999;
    while(flag>0){
             std::vector<int> empty(n);
    for(int i=0;i<arr.size();i++)
        m=(m<arr[i])?m:arr[i];
//cout<<m;
    cout<<arr.size()<<endl;
    for(int i=0;i<arr.size();i++){
        arr[i]=arr[i]-m;
        cout<<arr[i];
        if(arr[i]==0){
                empty.push_back(i);
        }
       // cout<<arr.size()<<endl;
    }
    for(int k=0;k<empty.size();k++)
        arr.erase(arr.begin()+empty[k]);
    cout<<endl;
     flag=arr.size();

    }

    return 0;
}
