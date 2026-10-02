/* Program No. 20: Knowing the execution order.*/
//Rajesh Jain Academy - Enter confidently in the world of I.T. 
//$$$$Predict the output.
class Demo 
{
   // Static variable
   static int x = initializeX();
   // Static Block 1
   static 
   {
        System.out.println("Static Block 1 executed");//
   }
    // Static Block 2
   static
   {
        System.out.println("Static Block 2 executed");
   }
    // Constructor
    Demo()
    {
        System.out.println("Constructor executed");
    }
    // Static method to initialize static variable
    static int initializeX() 
    {
        System.out.println("Static Variable initialized");
        return 100;
    }
    // Normal method
    void show() 
    {
        System.out.println("Normal method executed");
    }
}
public class staticpredictoutput {
    public static void main(String[] args) {
        System.out.println("Main method started\n");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        System.out.println("\nMain method ended");
    }
}//class P20




