//distribute books
import java.util.*;
class Books{
    public static void main(String[] args){
        int n=5;
        int[] ways=new int[n+1];
        Arrays.fill(ways,0);
        ways[0]=1;
        ways[1]=0;
        ways[2]=1;
        for(int i=3;i<=n;i++) ways[i]=(i-1)*(ways[i-1]+ways[i-2]);
        System.out.println(ways[n]%100000000L);
    }
}
