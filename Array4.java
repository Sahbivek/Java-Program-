import java.util.Scanner;
public class Array4 {
   
    
    
        public static void main(String[] args) {
            //arrange in ascending order
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        }
        boolean  isascending=true;
        for(int i=0;i<a.length-1;i++) {
            //notice a.length -1 as termination condition
            if(a[i]>a[i+1]) {
                isascending=false;
            }
        }
        if(isascending) {
            System.out.println("this array is sorted in asending order");
            }else {
                System.out.println("the array is not sorted in ascending order");
                
            }
        
        
    
        }
    
    }
     

