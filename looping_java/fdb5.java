import java.util.Scanner;

public class fdb5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ld=x%10,cur;
        x/=10;
        boolean f=false;
        while(x>0)
        {
            cur=x%10;
            if(cur>ld)
            {
                System.out.println("not ascending order");
                break;
            }
            else{
                ld=cur;
                x/=10;
                f=true;
            }
        }if(f)
        {
            System.out.println("ascending");
        }
    }
}
