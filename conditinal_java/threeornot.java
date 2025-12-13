import java.util.Scanner;
public class threeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if( a>=100 && a<=999 || a<=-100 && a>=-999 ){
            System.out.println("three digit number");
        } else {
            System.out.println("not three digit number");
        }
    }
    
}
