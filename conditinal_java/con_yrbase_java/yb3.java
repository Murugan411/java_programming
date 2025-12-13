import java.util.Scanner;
public class yb3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if((yr/100)==(yr%100))
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        sc.close();
    }
}