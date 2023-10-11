//lexi strings
import java.util.*;
class Lexi{
    public static void main(String[] args){
        String p="qwryupcsfoghjkldezvxbintma";
        String s="ativedoc";
        char[] c1=p.toCharArray();
        char[] c2=s.toCharArray();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<c2.length;i++){
            list.add(p.indexOf(s.charAt(i)));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(p.charAt(list.get(i)));
        }
    }
}
/*o/p: codevita*/
