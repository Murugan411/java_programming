//Write a Java Program to check whether a character is uppercase, lowercase, digit, or special symbol.
import java.util.Scanner;
public class ch2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if((int)a>=65 && (int)a<=90)
        {
            System.out.println("Uppercase");
        }
        else if((int)a>=97 && (int)a<=122)
        {
            System.out.println("Lower case");
        }
        else if((int)a>=48 && (int)a<=57)
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Symbol");
        }
    }
}