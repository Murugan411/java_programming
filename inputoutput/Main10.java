//write a java program to print the given octal number to integer:
import java.util.Scanner;
public class Main10
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int nm=Integer.parseInt(a,8);
		System.out.printf("%d",nm);
	}
}



