import java.util.Scanner;
public class fdb11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        boolean eve=false,od=false;
        while(temp>0)
        {
            int dig=temp%10;
            if(dig%2==0)
            {
                eve=true;
            }
            else{
                od=true;}
            temp/=10;
        }
        if(eve && od)
        {
            System.out.println("Mixed");
        }
        else if(eve)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
