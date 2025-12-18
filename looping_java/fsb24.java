import java.util.Scanner;

public class fsb24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i>0 && ((i&(i-1))==0))
            {
                System.out.println(i+" ");
            }
        }
    }
}
