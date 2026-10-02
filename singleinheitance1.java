class Bouns{
    int bouns;
    void setBonus(int bouns){
        this.bouns=bouns;
    }
}
class Manager extends Bouns{
    String name;
    int salary;
    void setName(String name){
        this.name=name;
    }
    void setBasicSalary(int salary){
        this.salary=salary;
    }
    void displayManager(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Bouns: "+bouns);
        System.out.println("Total Salary: "+(salary+bouns));
    }
}


public class singleinheitance1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Apoorva");
        m.setBasicSalary(150000);
        m.setBonus(20000);
        m.displayManager();
    }
}
