import java.util.Scanner;
public class sc2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a/10) {
            case 10:
            case 9:
            {
                System.err.println("A");
                break; 
            }
            case 8:
            case 7:
            {
                System.err.println("B");
                break;
            }
            case 6:
            case 5:
            {
                System.err.println("C");
                break; 
            }
            default:
                System.out.println("fail");   
        }
        sc.close();
    }

}
