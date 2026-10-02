import java.io.FileReader;
import java.io.IOException;

public class FileIOread {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Hello.txt");
        fr.read();
    }
}
