abstract class Shape{
    float a,b,area;
    Shape(float a,float b){
        this.a=a;
        this.b=b;
    }
   abstract void area();
   abstract void display();
}
class Circle extends Shape{
    Circle(float a){
        super(a,0);
    }
    void area(){
        area=3.14f*a*a;
    }
    void display(){
        System.out.println("Area of circle"+area);
    }
}
class Rectangle extends Shape{
    Rectangle(float a,float b){
        super(a, b);
    }
    void area(){
        area =a*b;
    }
    void display(){
        System.out.println("Area of rectangle: "+area);
    }
}
public class RuntimeShape {
    public static void main(String[] args) {
        Shape s;
        s=new Circle(12.4f);
        s.area();
        s.display();
        s=new Rectangle(12.4f,5.6f);
        s.area();
        s.display();
        
        
        

    }
}
