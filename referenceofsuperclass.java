
class X 
{
  void fun()
  {
    System.out.println("Hello X");
  }  
}//class X
//-----------------------------------------------------------------
class Y extends X
{
  void fun()
  {
    System.out.println("Hello Y");
  }
}//class Y
//-----------------------------------------------------------------
public class referenceofsuperclass
{
  public static void main(String r[])
  {
    X obj = new X();
    obj.fun();
    obj = new Y();
    obj.fun();
}//main
}//P30