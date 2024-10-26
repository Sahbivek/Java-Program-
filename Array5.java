import java.util.Scanner;
public class Array5 {
 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a%5==0 &&a%6==0) {
			System.out.println("it is divisible by both");
		}else if(a%5==0){
			System.out.println("it is only divisible by 5");
		}
		else if(a%6==0) {
			System.out.println("it is only divisible by 6");
		}
		else {
			System.out.println("it is neither divisible by 5 nor 6");
		}
	}

}


