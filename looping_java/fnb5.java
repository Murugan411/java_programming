import java.util.Scanner;
public class fnb5 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        while(n!=0)
        {
            num=num*10+(n%10);
            n=n/10;
        }
        System.out.println(num);
    }
    
}
