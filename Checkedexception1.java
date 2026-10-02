/*Program No. 5: User-defined exception*/
//Rajesh Jain Academy - Enter confidently in the world of I.T. 
//$$$$ Analyse and run the following program
class MyException extends Exception
{
  
}
class MyException1 extends Exception
{
  public String toString()
  {
  return ("\nMyException1 occurred");
  }
}
class MyException2 extends Exception
{
  MyException2()
  {
    System.out.println("\nMyException2 occurred.... printed in constructor");
  }
}
class P5
{
  public static void main(String args[])
  {
    try
    {
     throw new MyException();
    }
    catch(MyException e)
    {
     System.out.print("\nMyException occurred.... printed in catch block");
    }
    try
    {
     throw new MyException1();
    }
    catch(MyException1 e)
    {
      System.out.print(e+" ....printed using toString method");
    }
    try
    {
      throw new MyException2();
    }
    catch(MyException2 e)
    {
     ;
    }
    System.out.print("\nThe End...");
}//main
}//class