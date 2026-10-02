import java.util.Scanner;

class sum{
    int a,b,mul,sum;
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void add(){
        this.sum=a+b;
    }
    void mul(){
        this.mul=a*b;
    }
    void display(){
        System.out.println("Addition is "+this.sum);
        System.out.println("Multiplication is "+this.mul);
    }
}
public class addandnul {
    public static void main(String[] args) {
        sum s=new sum();
        s.read();
        s.add();
        s.mul();
        s.display();
        
    }
}
