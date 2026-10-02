abstract class Bank{
    abstract int  getinterface();
}
class SBI extends Bank{
    int getinterface(){
        return 8;
    }
}
class  ICIC extends Bank{
    int getinterface(){
        return 7;
    }
}
class AXIS extends Bank{
    int getinterface(){
        return 9;
    }
}
public class Runtimepolymorpism{
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("SBI rate of Interest: "+b.getinterface());
        b=new ICIC();
        System.out.println("ICIC rate of Interest: "+b.getinterface());
        b=new AXIS();
        System.out.println("Axis rate of Interest: "+b.getinterface());
        
    }
}