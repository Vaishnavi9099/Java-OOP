class Time{
    private int hr,min;
    Time(int hr,int min){
        this.hr=hr;
        this.min=min;
    }
    void display(){
        System.out.println("Time is "+hr+":"+min);
    }
}
class Date extends Time{
    int dd,mm,yr;
    Date(int hr,int min,int dd,int mm,int yr){
        super(hr,min);
        this.dd=dd;
        this.mm=mm;
        this.yr=yr;

    }
    void display(){
        super.display();
        System.out.println("Date is "+dd+"/"+mm+"/"+yr);
    }
}





public class inheritancedateandtime {
    public static void main(String[] args) {
        Date d=new Date(7,30,14,4,2026);
        d.display();
    }
}
