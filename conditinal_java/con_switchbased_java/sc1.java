
import java.util.Scanner;

public class sc1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        switch (c) {
            case '+':
                System.err.println(a+b);
                break;
            case '-':
                System.err.println(a-b);
                break;
            case '*':
                System.err.println(a*b);
                break;
            case '/':
                System.err.println(a/b);
                break;
            case '%':
                System.err.println(a%b);
                break;
            default:
              System.out.println("NO symbol");
        }
        sc.close();
    }

}
