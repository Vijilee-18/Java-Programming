/*Program to reverse a number and also to check Wheather it is Palindrome or not */

import java.util.Scanner;
public class Reverse_number {
	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=number.nextInt();
		int num_2=num;
		int reversed_num=0;
		int remainder;
		while(num!=0)
		{
			remainder=num%10;
			reversed_num=reversed_num*10+remainder;
			num=num/10;
		}
		System.out.println("The reversed number is:"+reversed_num);
		if(num_2==reversed_num) {
			System.out.println("It is a Palindrome number");
		}
		else {
			System.out.println("It Is not a Palindrome number");
		}
		
	}

}
