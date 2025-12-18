import java.util.Scanner;
public class fdb9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int las=a%10;
        a/=10;
        while(a>0)
        {
            int n=a%10;
            if(n>las)
            {
                las=n;
            }
            a/=10;
        }
        System.out.println(las);
    }
    
}
