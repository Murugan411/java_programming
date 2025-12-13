import java.util.Scanner;
public class same{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d)
            System.out.println("Same" );
        else
            System.out.println("Not Same");  
    }

    }
    

