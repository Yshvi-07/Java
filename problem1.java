import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            int g=sc.nextInt();
            if(g>=90){
                System.out.println("This is Good");
            }
            else if(g<=89 && g>=60){
                System.out.println("Also Good");
            }
            else{
                System.out.println("As well");
            }
            
        }else if(a==0){
            System.out.println("Invalid output");
        }
        
        
    }
}
