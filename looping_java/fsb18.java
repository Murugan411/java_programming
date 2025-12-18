import java.util.Scanner;
public class fsb18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            int org=i;
            int temp=i;
            int sum=0;
            while (temp>0) {
                int dig=temp%10;
                int fact=1;
                for (int j=1;j<=dig;j++) {
                    fact*=j;
                }
                sum=sum+fact;
                temp/=10;
            }
            if (sum==org) {
                System.out.print(org+" ");
            }
        }
    }
}
