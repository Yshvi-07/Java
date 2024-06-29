
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		//System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int r=1;
		
		for(int i=1;i<=m;i++){
		    r=r*n;
		}
		System.out.println(r);
	
	
		
		
	}
}
