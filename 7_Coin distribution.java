//coin distribution
import java.util.*;
class Coins{
    public static void main(String[] args){
        int n=19;
        int fives=(int)(n-4)/5,ones;
        if((n-(5*fives))%2==0) ones=2;
        else ones=1;
        int twos=(n-(5*fives)-ones)/2;
        System.out.println(ones+twos+fives+" "+fives+" "+twos+" "+ones);
    }
}
