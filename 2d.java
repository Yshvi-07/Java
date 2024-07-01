import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int x=sc.nextInt();
			for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(arr[i][j]==x){
		            System.out.println(i+","+j);
		            
		        }
		    }
		}
	}
}
