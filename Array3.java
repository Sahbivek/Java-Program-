import java.util.Scanner;
public class Array3 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int max=sc.nextInt();
		int min=sc.nextInt();
for(int i=0;i<a[i];i++) {
	if(a[i]<min) {
		min=a[i];
		
	}
	if(a[i]>max) {
		max=a[i];
	}
}
System.out.println("largest number is:" +max);
System.out.println("smallest number is:"+min);
	}

}


