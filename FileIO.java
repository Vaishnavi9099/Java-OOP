import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Hello.txt",true);
        for(int i=0;i<10;i++)
            fw.write("Vaishu\n");
        fw.close();

    }
}
