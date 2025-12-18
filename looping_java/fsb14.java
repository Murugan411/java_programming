import java.util.Scanner;
public class fsb14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();;
        int sum=0,c=0;
        while(true)
        {
            int a=sc.nextInt();
            if(a<0)
            {
                break;
            }
            sum+=a;
            c++;
        }
        System.out.println(sum);
    }
}
