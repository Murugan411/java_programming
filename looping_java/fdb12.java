import java.util.Scanner;
public class fdb12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        int eve=0,od=0;
        while(temp>0)
        {
            int dig=temp%10;
            if(dig%2==0)
            {
                eve+=dig;
            }
            else{
                od+=dig;}
            temp/=10;
        }
        System.out.println(eve-od);
    }
}
