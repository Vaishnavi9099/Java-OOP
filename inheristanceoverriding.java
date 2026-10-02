class Furniture{
     int len, wid;
    void setdataC(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
    void display(){
        System.out.println("length:"+len+"\twidth:"+wid);
    }
}
class Chair extends Furniture{
    private int wheels;
    void setdataC(int len,int wid,int wheels ){
        super.setdataC(len, wid);
        this.wheels=wheels;

    };
    void display(){
        super.display();
        System.out.println("wheels:"+wheels);
    }


}
public class inheristanceoverriding {
    public static void main(String[] args) {
        Chair c=new Chair();
        c.setdataC(20,50,3);
        c.display();
    }
}
