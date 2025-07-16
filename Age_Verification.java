import java.util.Scanner;
public class Age_Verification {
	public static void main(String[] args)
	{
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the no.of.People...?");
		int limit=num.nextInt();
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter your age:");
			int age=num.nextInt();
			if(age>=18)
			{
				System.out.println("Your Verification is been proceed");
			}
			else
			{
				System.out.print("Sorry age Verification failed...!!");
			}
		}
		
	}
	

}
