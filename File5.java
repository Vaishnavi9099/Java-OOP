
import java.io.File;
import java.util.Scanner;
class P12
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int i,cnt;
  boolean flag=false;
  System.out.println("Enter folder name with complete path");
  String fname=sc.nextLine();
  System.out.println("Enter file extension which you want see");
  String ext =sc.nextLine();
  File f1,f2;

  f1 = new File (fname);
    if(!f1.exists())	
     {
    System.out.println("This directory is not present");
    return;
  }
  if(!f1.isDirectory())
  {
    System.out.println("Its not a directory");
    return;
  }
    System.out.println("Files with extension "+ext+" are");
    String [ ]s = f1.list();
    for(i=0;i<s.length;i++){
        f2=new File(f1,s[i]);
    if(f2.isFile() && s[i].endsWith("." + ext))
    {
      System.out.println(s[i]);
      flag = true;
    }
  }

  if(!flag)
  {
    System.out.println("No files found");
  }
    
    
}
}//class