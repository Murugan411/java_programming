import java.util.Scanner;
public class sc3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            {
                System.err.println("weekday");
                break; 
            }
            default:
                System.out.println("weekend");   
        }
        sc.close();
    }

}
