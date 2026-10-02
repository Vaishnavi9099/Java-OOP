class Database{
    static Database d=new Database();
    static int count;
    static{
        System.out.println("Database Connections Created");
    }
    private Database(){
        count++;
    }
    static Database getinstance(){
        return d;
    }
    static void showcounter(){
        System.out.println("Constructor excuted times: "+count);
    }
}



public class Singeton {
    public static void main(String[] args) {
        Database d1= Database.getinstance();
        Database d2= Database.getinstance();
        Database d3= Database.getinstance();
        Database.showcounter();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
