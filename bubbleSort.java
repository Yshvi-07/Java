import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<a;i++){
		    ar[i]=sc.nextInt();
		    
		}
		for(int i=0;i<a;i++){
		    for(int j=0;j<a-i-1;j++){
		        if(ar[j]>ar[j+1]){
		            int temp=ar[j];
		            ar[j]=ar[j+1];
		            ar[j+1]=temp;
		        }
		    }
		   
		}
		int i;
        for (i = 0; i < a; i++){
            System.out.print(ar[i] + " ");
        
    }
	}
}
