import java.util.Scanner;
public class fcb4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        for(int i=(int)a+1;i<(int)b;i++)
        {
            System.out.print((char)i+" ");
        }
    }
}