import java.util.Scanner;
public class fsb17
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int num=i;
            int c=0;
            while(temp!=0)
            {
                c++;
                temp=temp/10;
            }
            temp=num;
            int sum=0;
            while(temp!=0)
            {
                int dig=temp%10;
                sum+=Math.pow(dig,c);
                temp=temp/10;
            }
            if(sum==num)
            {
            System.out.print(num+" ");
            }
    }
        
    }
} 
