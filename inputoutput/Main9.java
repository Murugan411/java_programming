//write a java program to print the given hexadecimal number to integer:
import java.util.Scanner;
public class Main9
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int nm=Integer.parseInt(a,16);
		System.out.printf("%d",nm);
	}
}


