import java.util.Scanner;

class fact{
    int a,i;
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        this.a=sc.nextInt();
    }
    void factors(){
        System.out.print("factors of given number are ");
        for(i=1;i<this.a;i++){
            
            if(this.a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}



public class factors {
    public static void main(String[] args) {
        fact f=new fact();
        f.read();
        f.factors();
    }
}
