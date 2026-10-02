/*Program No. 3:Exception handling : Use of ArrayIndexOutOfBoundsExeception - Traversal of an Array without using regular for-loop*/
/*Display content of given array using while(true) loop and exception handling*/
// Rajesh Jain Academy - Enter confidently in the world of I.T. 
//$$$$ Complete the following incomplete program
class P3
{
  public static void main(String args[]) 
  {
    int i=0;
    int a[]={10,20,30,40,50};
    System.out.println("The array contains following elements");
    // This program terminates throwing ArrayIndexOutOfBoundsException
    try{// Use try-catch block and get out of infinite-loop when exception occurs
    while(true)
    {
        System.out.println(a[i]);
        i++;
    }
}
 catch(ArrayIndexOutOfBoundsException e){ 
     System.out.println("Over...");}
  }//main
}//class 