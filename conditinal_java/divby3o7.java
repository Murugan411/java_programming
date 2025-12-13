import java.util.Scanner;
public class divby3o7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a%10);
        if((a%3==0 || a%7==0))
            System.out.println("divisible by both 3 either 7");
        else
            System.out.println("not divisible by 3 either 7");
        }

    }
    

