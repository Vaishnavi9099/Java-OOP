class department{
    String name;
    String dept;
    int salary;
    void setname(String name){
        this.name=name;
    }
    void setdept(String dept){
        this.dept=dept;
    }
    void display(){
          System.out.println("name:"+this.name+"\tdept:"+this.dept+"\tsalary:"+this.salary);
    }
    void setsalary(int salary){
        this.salary=salary;
    }
    int getsalary(){
        return this.salary;
    }
    String getname(){
        return this.name;
    }
    
}
public class getterfunction {
    public static void main(String[] args) {
        department d1=new department();
        department d2=new department();
        d1.setname("Amit");
        d1.setdept("Computer");
        d1.setsalary(80000);
        d2.setname("Vaishnavi");
        d2.setdept("IT");
        d2.setsalary(120000);
        d1.display();
        d2.display();
        if(d1.getsalary()>d2.getsalary()){
            System.out.println("name of teacher with maximum salary "+d1.getname());
        }
        System.out.println("name of teacher with maximum salary "+d2.getname());



    }
}
