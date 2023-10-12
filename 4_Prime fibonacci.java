//prime fibonacci
import java.util.*;
class Fibo{
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int a=2,b=40;
        Integer pro;
        List<String> prime=new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(isPrime(i)) prime.add(Integer.toString(i));
        }
        System.out.println(prime);
        List<Integer> list=new ArrayList<>();
        for(String i: prime){
            for(String j: prime){
                pro=Integer.valueOf(i+j);
                if(isPrime(pro) && !list.contains(pro)) list.add(pro);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        long n1=Collections.min(list),n2=Collections.max(list);
        long ans=0;
        System.out.println(n1+" "+n2);
        for(int i=0;i<list.size()-2;i++);{
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        System.out.println(ans);
    }
}
