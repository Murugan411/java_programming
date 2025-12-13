import java.util.Scanner;
public class first{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a%100);
        if(b%3==0)
            System.out.println("even");
        else
            System.out.println("odd");
        }

    }
    

