import java.util.Scanner;
public class fsb23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=10;i<=num;i++)
        {
            int sum;
            int temp=i;
            while(temp>9) { 
                sum=0;
                while(temp>0) {
                    sum+=(temp%10);
                    temp=temp/10;
                }
                temp=sum;
            }
            if(temp==1){
                System.out.print(i+" ");
            } 
        }
    }
}
