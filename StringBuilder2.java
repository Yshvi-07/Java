import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   // int n=sc.nextInt();
    /*String a=sc.next();
    
    String result="";
     for(int i=0;i<a.length();i++){
        if(a.charAt(i)=='e'){
            result+='i';
        }
        else{
            result+=a.charAt(i);
        }
        
    }
    System.out.println(result);*/
    StringBuilder s=new StringBuilder(sc.next());
    String g="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='e'){
            g+='i';
        }
        else{
            g+=s.charAt(i);
        }
        
    }
    System.out.println(g);
    
}
}
