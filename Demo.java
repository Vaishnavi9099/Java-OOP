//Program No. 4: Writing class in Java
//Rajesh Jain Academy - Enter confidently in the world of I.T. 
//$$$$Complete the incomplete program

class Player {
private int runs;
private String name;
public void display()
{
  System.out.println("Name:"+name+"\tRuns:"+runs);
}
public void setRuns(int runs) {
  this.runs = runs;
}
public void setName(String name) {
  this.name = name;
}
String getname(){
    return this.name;
}
int getruns(){
    return this.runs;
}
}
public class Demo
{  
public static void main(String args[])
{  
  Player p1=new Player();
  Player p2=new Player();
  Player p3=new Player();
  p1.setName("Virat");
  p1.setRuns(129);
  p2.setName("Ajinkya");
  p2.setRuns(81);
  p3.setName("Rohit");
  p3.setRuns(173);
  System.out.println("Name of player with minimum runs is ");
    if(p1.getruns()>p2.getruns()){
        System.out.println(p1.getname());
    }
    else{
        System.out.println(p2.getname());
    }
}//main
}//class Demo
