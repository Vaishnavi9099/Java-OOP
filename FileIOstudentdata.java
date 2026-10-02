import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOstudentdata {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int num=sc.nextInt();
        sc.nextLine();
        FileWriter fw=new FileWriter("Student.txt");
        for(int i=1;i<=num;i++){
         System.out.println("Enter the Rollno and name");
        fw.write(sc.nextLine()+"\n");
        }
        fw.close();
    }
}
