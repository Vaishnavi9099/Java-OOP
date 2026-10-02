
class P2Code
{
  public static void main(String args[])
  {
    int x=10,y=0,z;
    for(y=3;y>=-1;y--)
    {
      try
      {
        // monitor the code for exception
        z=x/y;//3,5,10,10
        System.out.println("\t\tI am in try block");
      }//try
      catch(ArithmeticException e)  //catch the divide-by-zero exception
      {
        System.out.println(e);
        z=x;
      }//catch
      System.out.println("y="+y+"\t"+"z=" + z);
    }//for
  }//main
}//class