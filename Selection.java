*******************************************************************************/
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
		for(int i=0;i<a-1;i++){
		    int s=i;
		    for(int j=i+1;j<a;j++){
		        
		        if(ar[s]>ar[j]){
		            s=j;
		            int temp=ar[i];
		            ar[i]=ar[j];
		            ar[j]=temp;
		        }
		    }
		   
		}
		int i;
        for (i = 0; i < a; i++){
            System.out.print(ar[i] + " ");
        
    }
	}
}
