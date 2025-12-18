import java.util.Scanner;
public class fsb19
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            int temp=i;
            for(int j=1;j<i;j++)
            {
                if(temp%j==0)
                    sum+=j;
            }
            if(sum==temp)
            {
                System.out.print(temp+" ");
            }
        }
    }
}