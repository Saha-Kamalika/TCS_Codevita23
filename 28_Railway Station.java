import java.util.*;
class Station{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arrive=new ArrayList<>();
        ArrayList<Integer> depart=new ArrayList<>();
        int x,y;
        for(int i=0;i<n;i++){
            sc.useDelimiter("[\\s,]+");
            x=sc.nextInt();
            y=sc.nextInt();
            arrive.add(x);
            depart.add(x+y);
        }
        Collections.sort(arrive);
        Collections.sort(depart);
        int p=1,r=1,i=1,j=0,ans=0;
        while(i<n && j<n){
            if((arrive.get(i))<=(depart.get(j))){
                p+=1;
                i++;
            }
            else{
                p-=1;
                j++;
            }
        }
        ans=Math.max(ans,p);
        System.out.println(p);
    }
}
