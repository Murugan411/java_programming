import java.util.Scanner;
public class yb4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a%10)==(b%10))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("Not equal");
        }
        sc.close();
    }
}