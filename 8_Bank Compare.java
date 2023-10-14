//bank compare
import java.util.Scanner;
class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,t,k=0;
        double p,pow,emi=0,s,y;
        double[] ans=new double[2];
        p=sc.nextDouble();
        t=sc.nextInt();
        for(int i=0;i<2;i++){
            n=sc.nextInt();
            emi=0;
            for(int j=0;j<n;j++){
                sc.useDelimiter("[\\s,]+");
                y=sc.nextDouble();
                s=sc.nextDouble();
                pow=Math.pow((1+s),y*12);
                emi=(p*s)/(1-1/pow);
            }
            ans[k++]=emi;
        }
        String res=(ans[0]<ans[1])?"BankA":"BankB";
        System.out.println(res);
    }
}
