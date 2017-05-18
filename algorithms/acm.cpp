#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    int m;
    cin >> n >> m;
    string topic[n];
    int num[n];
    for(int topic_i = 0;topic_i < n;topic_i++){
       cin >> topic[topic_i];
       num[topic_i]=atoi(topic[topic_i].c_str());
    }
    int max=0;
    for(int i = 0;i < n;i++){
        for(int j = 0;j < n;j++){
            int p=num[i]&num[j];
            if(p>max)
                max=p;
        }
    }
    char str[n];
    itoa(max,str,n);
    int count=0;
    for(int i =0;i<n;i++){
            if(str[i]=='1')
            count++;
    }
    cout<<count<<endl;
       int countnum=0;
        for(int i = 0;i < n;i++){
        for(int j = 0;j < n;j++){
            int p=num[i]&num[j];
            if(p==max)
                countnum++;
        }
    }
cout<<countnum<<endl;

    return 0;
}
