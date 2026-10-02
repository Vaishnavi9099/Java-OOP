import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the directory");
        String fname=sc.nextLine();
        File f1=new File(fname);
        
        if(f1.isDirectory()){
          
             System.out.println("Directory exists");
            
            String  List[]=f1.list();
            System.out.println("There are "+List.length+" file in a directory");
            int i=0;
            for(i=0;i<List.length;i++){
                if(List[i].startsWith("array")){
                System.out.println(List[i]);
                }
            }
            System.out.println(f1.getAbsolutePath());

            System.out.println(new Date(f1.lastModified()));
           
        }
        else{
            System.out.println("Directory not exists");
            
        }
    }
}
