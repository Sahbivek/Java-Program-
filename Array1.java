
import java.util.Scanner;

public class Array1 {
   
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
                    
            int a[]=new int[size];
        
        for(int i=0;i<size;i++) {
         a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<size;i++) {
            if(a[i]==x) {
            System.out.println(a[i]);
        }
        }
    
        }
    
    }
     

