class Date{
    int dd,mm,yr;
Date(){
this.dd=26;
this.mm=01;
this.yr=1950;
}
Date(int dd,int mm,int yr){
    this.dd=dd;
    this.mm=mm;
    this.yr=yr;

}
Date(int dd,int mm){
    this.dd=dd;
    this.mm=mm;
    this.yr=2016;
}
Date(Date p){
    this.dd=p.dd;
    this.mm=p.mm;
    this.yr=p.yr;
}
    void display(){
    System.out.println("Date is "+this.dd+"/"+this.mm+"/"+this.yr);
}
}
public class costructordate {
    public static void main(String[] args) {
        Date d=new Date();
        d.display();
        Date d1=new Date(12,9,2003);
        d1.display();
        Date d2=new Date();
        d2.display();
        Date d3=new Date(23,05);
        d3.display();
        Date d4=new Date(d2);
        d4.display();

    }
}
