class Employee{
    static String cname;
    String ename;
    Employee(String ename){
        this.ename=ename;
    }
    static void setcompanyname(String companyname){
        cname=companyname;
    }
    void display(){
        System.out.println("Empolyeename:\t"+ename+"  Companyname\t"+cname);
    }
}
public class staticemployee {
    public static void main(String[] args) {
        Employee.setcompanyname("TCS");
        Employee e1=new Employee("Virat");
        Employee e2=new Employee("Suyesh");
        Employee e3=new Employee("Ramesh");
        Employee e4=new Employee("Vaishu");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        System.out.println("AFTER COMPANY CHANGE");
        Employee.setcompanyname("Infosys");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
