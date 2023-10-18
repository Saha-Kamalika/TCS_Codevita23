//min combinations
import java.util.*;
class Combi{
    public static void main(String[] args){
        long n1,n2;
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0){
            sc.useDelimiter("[\\s,]+");
            n1=sc.nextLong();
            n2=sc.nextLong();
            System.out.println(gcd(n1,n2));
            t--;
        }
    }
    public static long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}
