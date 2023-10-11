//philaland coins
import java.util.*;
class Coins{
    public static void main(String[] args){
        int n=25,c=0;
        while(n>0){
            n/=2;
            c++;
        }
        System.out.println(c);
    }
}
/*o/p: 5*/
