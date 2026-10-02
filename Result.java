import java.util.Scanner;

class marks{
    int m1,m2,m3,m4,m5;
    float percentage;
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 4 subjects");
        this.m1=sc.nextInt();
        this.m2=sc.nextInt();
        this.m3=sc.nextInt();
        this.m4=sc.nextInt();

    }
    void percentage(){
        int sum=this.m1+this.m2+this.m3+this.m4;
        this.percentage=(sum*100)/400;
        System.out.println("Percentage of marks="+this.percentage);
    }
}
public class Result {
    public static void main(String[] args) {
        marks k=new marks();
        k.read();
        k.percentage();
    }
}
