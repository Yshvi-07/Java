import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int g=1<<b;
		int bi=~g;
	    System.out.println(bi&a);
	}
}
