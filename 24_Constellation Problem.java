//constellation problem
import java.util.Scanner;
class Constellation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] c=new char[3][n];
        for (int i=0;i<3;i++){
            String data="";
            if(sc.hasNext()){  
                data=sc.next();
            } else break;
            for(int j=0;j<n;j++)
                c[i][j]=data.charAt(j); 
        }
        String ans="";
        for(int j=0;j<n;j++){
            if(c[1][j]=='#'){
                ans+="#";
                continue;
            }
            else if(c[0][j]=='.' && c[1][j]=='.' && c[2][j]=='.'){
                ans+="";
                continue;
            }
            else if(c[1][j]=='.' && c[1][j+1]=='*' && c[1][j+2]=='.'){
                ans+="I";
                j+=2;
                continue;
            }
            else if(c[1][j]=='*' && c[1][j+1]=='.' && c[1][j+2]=='*'){
                if(c[0][j+1]=='.') ans+="U";
                else ans+="O";
                j+=2;
                continue;
            }
            else if(c[0][j]=='.' && c[0][j+1]=='*' && c[0][j+2]=='.'){
                ans+="A";
                j+=2;
                continue;
            }
            else{
                ans+="E";
                j+=2;
                continue;
            }
        }
        System.out.println(ans);
    }
}
