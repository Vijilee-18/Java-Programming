/* A Program to Display the marks and details of two Student */
class student{
	String name;
	int roll_no;
	int mark_1,mark_2,mark_3;
	float avg;
	student(String name,int roll_no,int mark_1,int mark_2,int mark_3){
		this. name=name;
		this. roll_no=roll_no;
		this.mark_1=mark_1;
		this.mark_2=mark_2;
		this.mark_3=mark_3;
	}
	public void CalculateAvg() {
		avg=(float)(mark_1+mark_2+mark_3)/3;
	}
	public void dispalyDetails() {
		System.out.println("Name:"+name);
		System.out.println("Roll_no:"+roll_no);
		System.out.println("Mark_1:"+mark_1+"\tMark_2:"+mark_2+"\tMark_3:"+mark_3);
		System.out.println("Average:"+avg);
	}
}
public class Student_detalis {
	public static void main(String[] args) {
		student student_1=new student("Vijilee",72,30,40,50);
		student_1.CalculateAvg();
		student_1.dispalyDetails();
		student student_2=new student("Johnson",46,40,50,60);
		student_2.CalculateAvg();
		student_2.dispalyDetails();
	}

}
