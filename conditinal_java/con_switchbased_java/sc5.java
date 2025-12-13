import java.util.Scanner;
public class sc5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case 1:
            {
                System.err.println("withdraw");
                break; 
            }
            case 2:
            {
                System.out.println("deposit");
                break;
            }
            case 3:
            {
                System.out.println("check balance");
                break;
            }
            case 4:
            {
                System.out.println("Exit");
            }
            default:
                System.out.println("NO option");   
        }
        sc.close();
    }

}

