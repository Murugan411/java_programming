import java.util.Scanner;
public class fdb7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int ld=a%10;
        a/=10;
        int mid=a%10;
        while(temp>=10)
        {
            temp/=10;
        }
        System.out.println(ld+""+mid+""+temp);
    }
}
