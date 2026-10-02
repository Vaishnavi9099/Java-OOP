class Hour{
    int min;    //instance variable
    int sec;
    int hours;
    void setmin(int min){
       
        this.min=min;
    }
    void sethour(int hours){
        this.hours=hours;
    }
    void setsec(int sec){
        this.sec=sec;
        
    }
    void display(){
        System.out.println(hours+":"+min+":"+sec);
    }
}
public class Time {
    public static void main(String[] args) {
        Hour t1=new Hour();
        Hour t2=new Hour();
        t1.setmin(12);
        t1.sethour(32);
        t1.setsec(52);
        t2.setmin(32);
        t2.sethour(21);
        t2.setsec(56);
        System.out.println("First time value is ");
        t1.display();
        System.out.println("Second time value is ");
        t2.display();

 }
     
}