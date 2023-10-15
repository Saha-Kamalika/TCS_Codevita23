//common steps
import java.util.*;
class Steps{
    public static void main(String[] args){
        int n=5;
        int[] ways=new int[n+1];
        Arrays.fill(ways,0);
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;
        for(int i=3;i<=n;i++) ways[i]=ways[i-3]+ways[i-2]+ways[i-1];
        System.out.println(ways[n]);
    }
}
