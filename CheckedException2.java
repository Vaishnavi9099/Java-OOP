

public class CheckedException2{
    public static void checkoe(int num){
        if(num==0){
            System.out.println("Number is zero");
        }
        else if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

 
    public static void main(String[] args) {
        
        try{
            checkoe(14);
        }
        catch(ArithmeticException e){

        }
        try{
            checkoe(0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            checkoe(3);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
