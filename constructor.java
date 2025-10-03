"""Description : A Simple Program Illustating the use of Constructor with "this" Keyword. Here While running without "this" operator will result different values for 'a' and 'b' ."""

class Sample{
    int a=10, b=20;
    Sample(int a,int b){
        this.a=a;
        this.b=b;

        System.out.println("a:"+a+" "+"b:"+b);
        print();
    }
    void print(){
        System.out.println("a:"+a+" "+"b:"+b);
    }
}
public class constructor {
    public static void main(String args[]){
        Sample sc=new Sample(30,40);

    }
}

