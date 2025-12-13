import java.util.Scanner;
public class lastdigiof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a%10);
        if(a%3==0)
            System.out.println("divisible by 3");
        else
            System.out.println("not divisible by 3");
        }

    }
    

