import java.util.Scanner;
public class fdb13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int res=0;
        int pl=1;
        while(x!=0)
        {
            int dig=x%10;
            if(dig!=0){
            res+=dig*pl;
            pl*=10;}
            x=x/10;
        }
        System.out.println(res);
    }
}
