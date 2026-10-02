
class Maam{
    String name;
    String dept;
    int salary;
    void setname(String name){
        this.name=name;
    }
    void setdept(String dept){
        this.dept=dept;
    }
    void setsalary(int salary){
        this.salary=salary;
    }
    void display(){
        System.out.println("name:"+this.name+"\tdept:"+this.dept+"\tsalary:"+this.salary);
    }
    void checksalary(){
        if(this.salary>100000){
            System.out.println("Good");
        }
        else{
            System.out.println("Ok");
        }
    }
}
public class teacher {
    public static void main(String[] args) {
        Maam m1=new Maam();
        Maam m2=new Maam();
        m1.setname("Amit");
        m1.setdept("Computer");
        m1.setsalary(80000);
        m2.setname("Patil");
        m2.setdept("IT");
        m2.setsalary(120000);
        System.out.println("First person");
        m1.display();
        m1.checksalary();
        System.out.println("Second person");
        m2.display();
        m2.checksalary();
    }
}
