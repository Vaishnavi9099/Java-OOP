class Student
{
  int rollno;
  String name;
  void setdata(int rollno, String name)
  {
    this.rollno=rollno;
    this.name=name;
  }
  void display()
  { 
    System.out.println("Roll Number: " + rollno+" Name: "+name);
    System.out.println("--------------------------------");
  }
}//class Student

class Test extends Student
{
  int maths,english,science;
  void setdata(int maths,int english, int science)
  {
    
    this.maths=maths;    
    this.english=english;    
    this.science=science;
  }
  void display()
  {  
    super.display();
    System.out.println("Marks\tMaths: "+maths+" English: "+english+" Science: "+science);
    System.out.println("--------------------------------");
  }
  public static String convert(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'convert'");
  }
}//class Test

class Result extends Test
{
  float percentage;
  void display()
  { 
    super.display();
    percentage=(maths+english+science)/3.0f;
    System.out.println("Percentage: "+percentage);
    System.out.println("--------------------------------");
  }
}//class Result
public class inheitancestudentdata {
    public static void main(String[] args) {
         Result R=new Result();
    R.setdata(21,"Rajesh Chaudhari");
    R.setdata(75,83,66);
    //display complete data of the student
    System.out.println("Complete data of the student is");
    System.out.println("--------------------------------");
    R.display();
    }
}
