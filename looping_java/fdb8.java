import java.util.Scanner;
public class fdb8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i =0;i<=9;i++){
            int count = 0;
            int temp = n;
            if(temp == 0 && i == 0){
            count = 1;
            }
            while(temp>0){
                int dig = temp % 10;
                if(dig == i ){
                    count++;
                }
                temp/=10;
            }
            if(count>0){
                System.out.println(i + ":" + count);
            }
        }
    }
}