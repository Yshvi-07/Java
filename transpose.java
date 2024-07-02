import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
	
			for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        //a[i][j]=sc.nextInt();
		        	System.out.print(a[j][i]+" ");
		    }
		    System.out.println("");
		    
		}
		
		
	}
}
