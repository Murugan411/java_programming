//Write a Java Program to check whether a character are equal or not.
import java.util.Scanner;
public class ch5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        if(a==b)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not");
        }
    }
}