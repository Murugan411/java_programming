import java.util.Scanner;
public class fdb14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=0;
        int cu=0;
        while (n!=0) {
            int dig=n%10;
            sq+=dig*dig;
            cu +=dig*dig*dig;
            n = n/10;
        }
        System.out.println(" square:" + sq);
        System.out.println("cube:" + cu);
    }
}
