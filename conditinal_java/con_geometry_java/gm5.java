import java.util.Scanner;
public class gm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
        sc.close();
    }
}
