import java.util.Scanner;
public class divby2n5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a%10);
        if((a%2==0 && a%5==0 &&a%8!=0))
            System.out.println("divisible by both 2 and 5 but not by 8");
        else
            System.out.println(" divisible by 2 and 5 or divisible by 8");
        }

    }
    

