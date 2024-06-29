import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++){
		    int s=a+b;
		    System.out.println(s);
		    a=b;
		    b=s;
		}
	
		
		
	}
}
