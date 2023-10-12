//kth largest factor
import java.util.*;
class Factor{
    public static void main(String[] args){
        long n=10000000000L;
        int k=7;
        List<Long> list=new ArrayList<>();
        list.add(1L);
        for(long i=2;i*i<=n;i++){
            if(n%i==0) {
                list.add(i);
                list.add(n / i);
            }
        }
        list.add(n);
        Collections.sort(list);
        System.out.println(list);
        if(list.size()==-1 || k>list.size()) System.out.println(1);
        else System.out.println(list.get(list.size()-k));
    }
}
