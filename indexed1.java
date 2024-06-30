import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		
		int g=0;
		for(int i=0;i<n;i++){
		    if(m==a[i]){
		        
		        g=i+1;
		        break;
		    }
		    
		}
		System.out.println(g);
		
	}
}
