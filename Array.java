
    import java.util.Scanner;

	public class Array {
	public static void main(String[] args) {
		int lenStr1, lenStr2, lenStr3;
		String string1, string2, string3;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter first string: ");
		string1 = input.next();
		System.out.print("Please enter second string: ");
		string2 = input.next();
		System.out.print("Please enter third string: ");
		string3 = input.next();
		lenStr1 = string1.length();
		lenStr2 = string2.length();
		lenStr3 = string3.length();
		
		if(lenStr1 > lenStr2 && lenStr1 > lenStr3 && lenStr2 > lenStr3)
			{
				System.out.println(string1 +" , " + string2 +" , " + string3);
			}
		
		else if(lenStr1 > lenStr2 && lenStr1 > lenStr3 && lenStr3 > lenStr2)
			{
				System.out.println(string1 +" , " + string3 +" , " + string2);
			}
		
		else if(lenStr2 > lenStr1 && lenStr2 > lenStr3 && lenStr1 > lenStr3)
			{
				System.out.println(string2 +" , " + string1 +" , " + string3);
			}
		
		else if(lenStr2 > lenStr1 && lenStr2 > lenStr3 && lenStr1 < lenStr3)
			{
				System.out.println(string2 +" , " + string3 +" , " + string1);
			}
		
		else if(lenStr3 > lenStr1 && lenStr3 > lenStr2 && lenStr2 > lenStr1)
			{
				System.out.println(string3 +" , " + string2 +" , " + string1);
			}
		
		else if(lenStr3 > lenStr1 && lenStr3 > lenStr2 && lenStr2 < lenStr1)
			{
				System.out.println(string3 +" , " + string1 +" , " + string2);
			}
		
		else
			{
				System.out.println("Please enter strings that don't have same number of characters.");
			}
	}

}

