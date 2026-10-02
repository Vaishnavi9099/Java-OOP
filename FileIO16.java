/*Program No. 16: Ask some information to user and store it in a file*/
// Rajesh Jain Academy - Enter confidently in the world of I.T. 
//$$$$ Complete the following incomplete program

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileIO16
{
public static void main(String args[]) throws IOException 
{
    FileWriter fw=new FileWriter("Record.txt",true);
  
  
  Scanner sc=new Scanner(System.in);
  System.out.println("What is your name");
  String name =sc.next();
  fw.write(name+"\n");
  String edu[]={"Demo","Engineering","Diploma","BCS","BCA","MCA"};
  System.out.println("What you are studying ");
  for (int i=1; i<edu.length; i++)
  {
    System.out.print(i+". "+edu[i]+" ");
    ;
  }//for
  int educationIndex =sc.nextInt();
    fw.write("Education: " + edu[educationIndex] + "\n"); 
  String courses[]={"Demo","Java+DSA","Full-Stack Development","Data Analytics","Python"};
  System.out.println("Which course you are interested in ");
  for (int i=1; i<courses.length; i++)
  {
    System.out.print(i+". "+courses[i]+" ");
   
  }//for
  int courseIndex =sc.nextInt();
  fw.write("Course: " + courses[courseIndex] + "\n"); 
  
  
  fw.close();
}
}//class
