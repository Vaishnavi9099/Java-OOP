/*Program No. 8: File class: Finding information of a file*/
//Rajesh Jain Academy - Enter confidently in the world of I.T. 
//$$$$ Analyse and run the following program

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class File1
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter file name with complete path\n");
String fname=sc.nextLine();
File f1 = new File (fname);
if(!f1.exists())
{
  System.out.println("No such File...");
  return;
}
  System.out.println("File exists");
/*------------------File Information-----------------------*/
  System.out.println("File Name:\t"+f1.getName());
  System.out.println("File Path:\t"+f1.getPath());
  System.out.println("Absolute Path:\t"+f1.getAbsolutePath());
  System.out.println("Parent:\t"+f1.getParent());
/*--------Time is obtained in miliseconds from 1/1/1970 midnight-----*/
  System.out.println("Last modified:\t"+f1.lastModified());
  System.out.println("Last modified:\t"+new Date(f1.lastModified()));
  System.out.println("File size:\t"+f1.length()+" bytes");
/*------------------File tests-----------------------*/
  if(f1.canWrite())
    System.out.println("It is writable");
  else
    System.out.println("It is not writable");

  if(f1.canRead())
    System.out.println("It is readable");
  else
    System.out.println("It is not readable");

  if(f1.isFile())
    System.out.println("It is a File");
  else
    System.out.println("It is not a File");    

  if(f1.isDirectory())
    System.out.println("It is a Directory");
  else
    System.out.println("It is not a Directory");    

  if(f1.isAbsolute())
    System.out.println("It is absolute path");
  else
    System.out.println("It is not absolute path");  // it is in local directory

  if(f1.isHidden())
    System.out.println("It is hidden file");
  else
    System.out.println("It is not hidden file");
}
}//class