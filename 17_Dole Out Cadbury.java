//dole out cadbury
import java.util.*;
class Main{
    public static int count(int a,int b){
        int mini=Math.min(a,b);
        int maxi=Math.max(a,b);
        int choco,ns;
        if(mini==0) return 0;
        if(mini==1) return a*b;
        choco=maxi/mini;
        ns=maxi%mini;
        choco+=count(ns,mini);
        return choco;
    }
    public static void main(String[] args){
        int p,q,r,s;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        r=sc.nextInt();
        s=sc.nextInt();
        int ans=0;
        for(int i=p;i<=q;i++){
            for(int j=r;j<=s;j++){
                ans+=count(i,j);
            }
        }
        System.out.println(ans);
    }
}

