//divine divisors
import java.util.*;
class Divisor{
    public static void main(String[] args){
        HashSet<Long> set=new HashSet<>();
        long n=10;
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                set.add(i);
                set.add(n/i);
            }
        }
        List<Long> list = new ArrayList<>(set); 
        Collections.sort(list); 
        System.out.println(list);
    }
}
