class Complex{
    int real;
    String img;
    Complex(){
        real=5;
        img="i5";
    }
    void display(){
        System.out.println("("+real +","+img+")");
    }
}


public class constructordefault {
    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.display();
        Complex c2=new Complex();
        c2.display();
    }
}
