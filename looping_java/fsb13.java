import java.util.Scanner;
public class fsb13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;
        while(true)
        {
            n=sc.nextInt();
            if(n<0)
            {
                break;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}
