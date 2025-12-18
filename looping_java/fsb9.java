import java.util.Scanner;
public class fsb9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                e+=i;
            else
                o+=i;
        }
        System.out.println(e);
        System.out.println(o);
    }
}
