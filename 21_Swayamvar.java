//swayambar
import java.util.*;
class Swayambar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.useDelimiter("[\\s,]+");
        String f=sc.next();
        String m=sc.next();
        int rcount=0,mcount=0;
        ArrayList<Character> list=new ArrayList<>();
        char[] fem=f.toCharArray();
        char[] mal=m.toCharArray();
        for(char c: fem) list.add(c);
        for(int i=0;i<mal.length;i++){
            if(mal[i]=='r') rcount++;
            else mcount++;
        }
        System.out.println(rcount+" "+mcount);
        for(int i=0;i<fem.length;i++){
            if(fem[i]=='r'){
                if(rcount==0){
                    System.out.println(list.size());
                    break;
                }
                rcount--;
                list.remove(0);
            }
            else if(fem[i]=='m'){
                if(mcount==0){
                    System.out.println(list.size());
                    break;
                }
                mcount--;
                list.remove(0);
            }
        }
        if(list.size()==0) 
            System.out.println(0);
    }
}
