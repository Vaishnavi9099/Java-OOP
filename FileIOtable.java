import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOtable {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        FileWriter fw=new FileWriter("Table.txt",true);
        for(int i=1;i<11;i++){
            fw.write(num+"*"+i+"="+(num*i)+"\n");
            
        }
        fw.close();
    }
}
