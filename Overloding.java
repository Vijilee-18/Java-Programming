"""Descrption : Simple Program Illustrating The Concept Of Method OverLoading"""

class Samples{
    void display(){
        System.out.println("Hello");
    }
    void display(int x){
        System.out.println("Value passed to the method is:"+x);
    }
    void display(String name){
        System.out.println("The String passed is "+name);
    }
    void display(int x,int y){
        System.out.println("Value of X and Y passed is :"+x+"\t"+y);
    }
}
public class Overloding {
    public static void main(String[] args) {
        Samples sc=new Samples();
        sc.display("Vijilee");
        sc.display();
        sc.display(10);
        sc.display(15,20);

    }
}

