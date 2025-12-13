//Write a Java Program to check whether a character is alphabet or not.
import java.util.Scanner;
public class ch3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(((int)a>=65 && (int)a<=90)||((int)a>=97 && (int)a<=122))
        {
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not");
        }
    }
}