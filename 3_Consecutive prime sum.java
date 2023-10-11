//consecutive prime sum
import java.util.*;
class Consecutive_primeSum{
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n=50,sum,count=0;
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)) list.add(i);
        }
        for(int i=2;i<list.size();i++){
            sum=0;
            for(int j: list){
                sum+=j;
                if(sum==list.get(i)){
                    System.out.print(sum+" ");
                    count++;
                    break;
                }
                if(sum>list.get(i)) break;
            }
        }
        System.out.println();
        System.out.println("count is: "count);
    }
}
