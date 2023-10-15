//counting rock samples
import java.util.Scanner;
class Count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s,t,c=0,count=0,r1,r2;
        sc.useDelimiter("[\\s,]+");
        s=sc.nextInt();
        t=sc.nextInt();
        int[] sam=new int[s],ans=new int[t];
        for(int i=0;i<s;i++) sam[i]=sc.nextInt();
        for(int i=0;i<t;i++){
            sc.useDelimiter("[\\s,]+");
            r1=sc.nextInt();
            r2=sc.nextInt();
            for(int j=0;j<s;j++){
                if(sam[j]>=r1 && sam[j]<=r2) count++;
            }
            ans[c++]=count;
            count=0;
        }
        for(int i=0;i<c;i++) System.out.print(ans[i]+" ");
        System.out.println();
    }
}
