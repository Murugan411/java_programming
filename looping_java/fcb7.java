
import java.util.Scanner;
public class fcb7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,c=0;
        while(n!=0)
        {
            int temp=n%10;
            n=n/10;
            if(temp==0)
            {
                c++;
            }
            else{
                i++;
            }
        }
        System.out.println("0's:"+c);
        System.out.println("1's:"+i);
    }
    
}
