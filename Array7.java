import java.util.Scanner;
public class Array7 {
   


	public static void main(String[] args) {
double sum=0;
	double a[]= {2.34,7.89,1.34,1.54,9.54,7.34,6.34,8.12,3.23,9.23};
		for(int i=0;i<10;i++) {
		System.out.println(a[i]);
			sum+=a[i];
	}
			System.out.println(sum);
		
	//int id[]= {1,2,3,4,5,6,7,8,9,10};
	//	System.out.print(Arrays.toString(id));
	//	System.out.print("bivek");
		
		for(int i=0;i<10;i++){
			if(a[i]<5.00)
			System.out.println(a[i]);
			}
			double avg=sum/10;
		System.out.println(avg);
			System.out.println("");
			for(int i=0;i<10;i++) {
	if(a[i]>avg)
		System.out.println(a[i]);
					
			}
		}
	

	}




