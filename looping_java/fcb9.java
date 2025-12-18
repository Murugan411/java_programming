
import java.util.Scanner;
public class fcb9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int d=0,p=0;
        while(b>0)
        {
            int l=b%10;
            d+=l*(int)Math.pow(2,p);
            p++;
            b/=10;
        }
        System.out.println(d);
    }
}