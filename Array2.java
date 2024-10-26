import java.util.Scanner;

public class Array2 {


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rows=sc.nextInt();
	int cols=sc.nextInt();
	int[][]a=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int x=sc.nextInt();
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
		//compare with x
		if(a[i][j]==x) {
			System.out.println("x found at location("+i  +", "+j  +")");
		}
	}
		

	}

}
}

