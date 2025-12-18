import java.util.Scanner;
public class fdb4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int dig=a;
        int f=0;
        while(dig>0)
        {
            int n=dig%10;
            if(n==b)
            {
                f++;
            }
            dig/=10;
        }
        System.out.println(f);
    }
}
