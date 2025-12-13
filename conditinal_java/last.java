import java.util.Scanner;
public class last{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a%10);
        if(b%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        }

    }
    

