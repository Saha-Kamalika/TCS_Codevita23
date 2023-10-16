//similar character problem
import java.util.Scanner;
class Similar{
    public static void main(String[] args){
        int n;
        String s="kamalika";
        int q=2,count=0;
        Scanner sc=new Scanner(System.in);
        while((q--)!=0){
            count=0;
            int p=sc.nextInt();
            char c=s.charAt(p-1);
            for(int i=0;i<p-1;i++){
                if(s.charAt(i)==c) count++;
            }
            System.out.println(count);
        }
    }
