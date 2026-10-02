class Employee{
    int id;
    String name;
    float salary;
    float bouns;
    double sum=0;
    Employee(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    float getsalary(){
        return salary;

    }

    
   
    
    void display(double usalary){
        
        System.out.println(name+"\t"+salary+"\t"+"\t"+"\t"+usalary);
  
    }
  
}





public class arrayofobjectsemployee {
    public static void main(String[] args) {
        Employee[] emp = {
            new Employee(101, "Amit", 45000),
            new Employee(102, "Neha", 52000),
            new Employee(103, "Rahul", 39000),
            new Employee(104, "Sneha", 61000),
            new Employee(105, "Vikas", 47000)
        };
        System.out.println("Name\t"+"Origginal salary\t"+"Updated salary (5% bouns)");
        System.out.println("--------------------------------------------------------");
        int i;
        double updatedSalary,sum=0;
        for(i=0;i<emp.length;i++){
            double bouns=emp[i].getsalary()*0.05;
            updatedSalary=emp[i].getsalary()+bouns;
            sum+=emp[i].getsalary();
            
              emp[i].display(updatedSalary);
            }
  
          
           
        System.out.println("--------------------------------------------------------");
         System.out.println(sum);
        // int count=0;
        // for(i=0;i<emp.length;i++){
        
        //   }
        
        
    

    }
}
