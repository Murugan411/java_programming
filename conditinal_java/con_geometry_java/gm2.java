import java.util.Scanner;

public class gm2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
            System.out.println("Right Triangle");
        } else {
            System.out.println("Not a Right Triangle");
        }
        sc.close();
    }
}

