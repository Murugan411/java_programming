import java.util.Scanner;
public class fnb13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean p=false;
        for (int i=0;i*i<=n;i++) {
            if (i*i==n) {
                p=true;
                break;
            }
        }
        if(p) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}

