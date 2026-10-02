import java.util.Scanner;

class Student{
    private int rollno;
    private String name;
    private float marks;
    Student(int rollno,String name,float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;


    }
     float getmarks(){
        return marks;
    }
    void display(){
        System.out.println("Rollno: "+rollno+"\tname: "+name+"\tmarks: "+marks);
    }
}
public class arrayofobject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many students");
        int num=sc.nextInt();
        Student s[]=new Student[num];
        int i,r;
        String n;
        float m;
        System.out.println("Enter the data of student");
        for(i=0;i<s.length;i++){
            r=sc.nextInt();
            n=sc.next();
            m=sc.nextFloat();
            s[i]=new Student(r, n, m);
        }//for
        float max=s[0].getmarks();
        int pos=0;
        for(i=1;i<s.length;i++){
            if(s[i].getmarks()>max){
                max=s[i].getmarks();
                pos=i;
            }        
        } 
        System.out.println("Data of Student with highest marks:");
        s[pos].display();

        float min=s[0].getmarks();
        int pos1=0;
        for(i=1;i<s.length;i++){
            if(s[i].getmarks()<min){
                min=s[i].getmarks();
                pos1=i;
                
            }
        }
        s[pos1].display();
        
    }
}
