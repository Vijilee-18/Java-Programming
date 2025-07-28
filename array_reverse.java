import java.util.Scanner;
public class array_reverse {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size=input.nextInt();
		int [] array=new int[size];
		System.out.println("Enter the Array Element's:");
		for(int i=0;i<size;i++) {
			System.out.println("Enter Element_"+(i+1)+":");
			array[i]=input.nextInt();
		}
		int temp;
		for(int i=0,j=size-1;i<j;i++,j--) {
			temp=array[j];
			array[j]=array[i];
			array[i]=temp;
		}
		System.out.println("The Reversed Array is :");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
