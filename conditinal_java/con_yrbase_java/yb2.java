import java.util.Scanner;
public class yb2
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int yr=sc.nextInt();
    if((yr%100==0))
    {
        System.out.println("Century year");
    }
    else
    {
        System.out.println("Not Century year");
    }
    sc.close();
}
}
