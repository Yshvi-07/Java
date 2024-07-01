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
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int choti=Integer.MIN_VALUE;
		int badi=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    if(a[i]>choti){
		        choti=a[i];
		    }
		    if(a[i]<badi){
		        badi=a[i];
		    }
		}
		System.out.println(choti);
		System.out.println(badi);
		
		}
}
