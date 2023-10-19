//monkey grooving
import java.util.*;
class Monkey{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n+1];
        for(int i=1;i<=n;i++) x[i]=sc.nextInt();
        int[] y=new int[n+1];
        Arrays.setAll(y,i->i);
        int[] z=new int[n+1];
       
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int i: x) l1.add(i);
        for(int i: y) l2.add(i);
        ArrayList l4=(ArrayList)l2.clone();
        System.out.println(l2);
        int count=0;
        while(true){
        Arrays.fill(z,0);
        l3.clear();
        for(int i: z) l3.add(i);
        for(int i=1;i<=n;i++){
            l3.set(l1.get(i),l2.get(i));
        }
        count++;
        //System.out.println(l2);
        if(l3.equals(l4)){
            System.out.println(count);
            break;
        }
        else l2=(ArrayList)l3.clone();
        }
    }
}
