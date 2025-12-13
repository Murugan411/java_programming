//Write a Java Program to print your roll number and name in the format: Roll No: 123, Name: John
import java.util.Scanner;
public class Main21{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        sc.nextLine();
        String nm=sc.nextLine();
        System.out.println("Roll No:"+r+","+"Name:"+nm);
    }
}









