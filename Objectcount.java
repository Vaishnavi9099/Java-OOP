class Student{
    static int count;
    String name;
     Student(String n){
        name=n;
        count++;
    }
     void  showdisplay(){
        System.out.println("Name: "+name+" "+count);
    }
}



public class Objectcount {
    public static void main(String[] args) {
        Student s1=new Student("Vaishu");
        s1.showdisplay();
        Student s2=new Student("Raj");
        s2.showdisplay();
        Student s3=new Student("Amit");
        s3.showdisplay();
    }
}
