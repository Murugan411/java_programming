import java.util.Scanner;
public class sc4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case 1:
            case 12:
            case 11:
            {
                System.err.println("winter");
                break; 
            }
            case 2:
            case 3:
            case 4:
            case 5:
            {
                System.out.println("Summer");
                break;
            }
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            {
                System.out.println("rainy");
                break;
            }
            default:
                System.out.println("NO MONTH");   
        }
        sc.close();
    }

}
