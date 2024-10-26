import java .util.Scanner;
public class Switch {
	


	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("choice pizza size-S:M:L: X");
	   char A =sc.next().charAt(0);
	switch( A) {
	  case'S':
		      System.out.println("price:RS600.99");
	              break;
	case 'M':
	       System.out.println("price:RS800.99");
	          break;
	case 'L':
	      System.out.println("price:RS1200.50");
	        break;
	case'X':
	          System.out.println("price:RS1500.00");
	               break;
	default:
		     System.out.println("error message");
		

	}


	
	}

}

    

