import java.util.Scanner;
public class User_input {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		System.out.println("The number Entered is:"+number);
		if(number%2==0) {
			System.out.println("This is an even number");
		}
		else {
			System.out.println("This is an Odd  number");
		}
	}

}
