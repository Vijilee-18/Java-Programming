import java.util.Scanner;
public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Enter the number Whose Multiplication Table Should be Printed: ");
		int num=number.nextInt();
		System.out.println("Enter the Limit Upto Which the Table need to be Printed:");
		int limit=number.nextInt();
		for(int i=1;i<=limit;i++) {
			int result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}
	}
}
