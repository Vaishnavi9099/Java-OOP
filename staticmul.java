class Cal{
  
    static void  add(int a,int b){
        System.out.println("Addition is: "+(a+b));
    }
    static void mul(int a,int b){
        System.out.println("Multiplication is: "+(a*b)); 
    }
   
    }



public class staticmul {
    public static void main(String[] args) {
        Cal.add(10,5);
        Cal.mul(10, 5);
    }
}
