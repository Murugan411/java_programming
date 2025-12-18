import java.util.Scanner;

public class fnb14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int org=num;
        int sum=0;
        while (num>0) {
            int dig=num%10;
            int fact=1;
            for (int i=1;i<=dig;i++) {
                fact*=i;
            }
            sum=sum+fact;
            num/=10;
        }
        if (sum==org) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
