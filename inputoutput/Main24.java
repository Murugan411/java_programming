//Q24. Write a Java Program to print current time in the format HH:MM:SS.
import java.util.Scanner;
public class Main24{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int h=sc.nextInt();
       int m=sc.nextInt();
       int s=sc.nextInt();
       System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}









