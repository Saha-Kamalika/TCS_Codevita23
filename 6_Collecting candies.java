//collecting candies
import java.util.*;
class Candy{
    public static void main(String[] args){
        int n=4,ans=0,time=0;
        int[] nums={1,2,3,4};
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for(int el: nums) list.add(el);
        while(list.size()>=2){
            Collections.sort(list);
            time=list.get(0)+list.get(1);
            list1.add(time);
            list.remove(0);
            list.remove(0);
            list.add(time);
        }
        for(int e: list1) ans+=e;
        System.out.println(ans);
    }
}
