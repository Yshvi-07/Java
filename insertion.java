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
		for(int i=1;i<n;i++){
		    int c=a[i];
		    int j=i-1;
		    while(j>=0 && c<a[j]){
		        a[j+1]=a[j];
		        j--;
		    }
		    a[j+1]=c;
		    
		}
		for(int i=0;i<n;i++){
		    System.out.println(a[i]);
		}
	}
}
