import java.util.Scanner;
public class fdb2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dig=n;
        while (dig>=10)
        {
            dig/=10;
        }
        if(dig%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
