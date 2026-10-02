class Person{
    String name;
    int age;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        
    }
}
class Student extends Person{
    String course;
    int marks;
    void setCourse(String course){
        this.course=course;
    }
    void setMarks(int marks ){
        this.marks=marks;
    }
    
    void displayStudent(){
        System.out.println("course: "+course);
        System.out.println("marks: "+marks);
    }
}

public class Singleinheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shubham Patil");
        s.setAge(20);
        s.setCourse("Java+DSA");
        s.setMarks(85);
        s.displayPerson();
        s.displayStudent();
    }
}
