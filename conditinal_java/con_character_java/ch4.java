//Write a Java Program to check whether a character is a digit or not.
import java.util.Scanner;
public class ch4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if((int)a>=48 && (int)a<=57)
        {
            System.out.println("digit");
        }
        else{
            System.out.println("Not");
        }
    }
}