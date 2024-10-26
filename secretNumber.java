
import java.util.Scanner;
public class secretNumber {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("think the secret number between 1 and 1000");
		
		System.out.println("divide by 7 and tell me the number");
		double first=sc.nextInt();
		System.out.println("divide by 11 and tell me the number");
		double second=sc.nextInt();
		System.out.println("divide by 13 and tell me the number");
		double third=sc.nextInt();
		
		first=first*715;
		second=second*364;
		third=third*924;
		double sum=first+second+third;
	  double a=sum%1001;
	 System.out.println(a);
		

	}

}
 
    

