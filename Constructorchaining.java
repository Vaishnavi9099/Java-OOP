class Date{
    int d,m,yr;
Date(){

}
Date(int d,int m,int yr){
    this.d=d;
    this.m=m;
    this.yr=yr;
}
Date(Date p){
    this.d=p.d;
    this.m=p.m;
    this.yr=p.yr;

}
void display(){
    System.out.println(d+"/"+m+"/"+yr);
}
}



public class Constructorchaining {
    public static void main(String[] args) {
        Date d1=new Date();
        d1.display();
        Date d2=new Date(17,8,2005);
        d2.display();
        Date d3=new Date(d1);
        d3.display();

    }
}
