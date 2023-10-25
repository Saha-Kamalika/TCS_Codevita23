//digits pairs
#include<iostream>
using namespace std;
int calScore(int n){
    int x,y,z,min,max,score=0;
    x=n%10;
    n/=10;
    y=n%10;
    n/=10;
    z=n%10;
    n/=10;
    max=(x>y)?x:y;
    max=(z>max)?z:max;
    min=(x<y)?x:y;
    min=(z<min)?z:min;
    score=(max*11+min*7)%100;
    return score;
}
int Pairs(int sc[],int n){
    int dig[10]={0},msb;
    for(int i=0;i<n;i+=2){
        msb=sc[i]/10;
        for(int j=i+2;j<n;j+=2){
            if(msb==sc[j]/10){
                if(dig[msb]<2) dig[msb]++;
            }
        }
    }
    for(int i=1;i<n;i+=2){
        msb=sc[i]/10;
        for(int j=i+2;j<n;j+=2){
            if(msb==sc[j]/10){
                if(dig[msb]<2) dig[msb]++;
            }
        }
    }
    int res;
    for(int i=0;i<10;i++){
        res+=dig[i];
    }
    return res;
}
int main(){
    int n;
    int num[50],sc[50];
    cin>>n;
    for(int i=0;i<n;i++) 
        cin>>num[i];
    for(int i=0;i<n;i++)
        sc[i]=calScore(num[i]);
    cout<<Pairs(sc,n);
    return 0;
}
