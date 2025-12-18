import java.util.Scanner;
public class fcb8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int b=0,p=1;
        while (n>0){
            int rem=n%2;
            b=b+rem*p;
            p=p*10;
            n=n/2;
        }
        System.out.println(b);

    }    
}
