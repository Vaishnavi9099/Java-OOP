import java.io.File;
import java.util.Scanner;

public class File4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the directory name");
        String fname=sc.next();
        File f=new File(fname);
        if(f.exists()){
        File list[]=f.listFiles();
        File f1;
        int i;
        for(i=0;i<list.length;i++){
            f1=list[i];
            System.out.println(f1+"==>  "+f1.length()+" bytes");
        }
    }
    else{
        System.out.println("Directory does not exists");
    }
    
    }
}
