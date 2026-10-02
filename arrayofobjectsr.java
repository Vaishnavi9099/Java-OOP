import java.util.Scanner;

class Player{
    private int runs;
    private String name;
    Player(int runs,String name){
        this.runs=runs;
        this.name=name;
    }
    int getruns(){
        return runs;
    }

}
public class arrayofobjectsr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number of players");
        int num=sc.nextInt();
        Player p[]=new Player[num];
        int i,r,count=0,count1=0;
        String n;
        System.out.println("Players are ");
        for(i=0;i<p.length;i++){
            r=sc.nextInt();
            n=sc.next();
            p[i]=new Player(r,n);
        }
        for(i=0;i<p.length;i++){
        if(p[i].getruns()>=100){
            count++;
        }
        else if (p[i].getruns()>=50){
            count1++;
        }
    }
        System.out.println(count+" Player scored centenuries ");
        System.out.println(count1+" player scored more than fifty runs");
    }
}
