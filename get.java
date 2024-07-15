import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int p=sc.nextInt();
		int g=1<<p;
		if((g&a)==0){
		    System.out.println("No");
		}
		else{
		    System.out.println("Yes");
		}
	}
}
