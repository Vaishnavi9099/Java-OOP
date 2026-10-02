import java.util.Scanner;

class Book{
    int id;
    String name;
    int price;
    Book(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
    String getname(){
        return name;
    }
}


public class objectlsearch {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Basics", 450),
            new Book(102, "Python Programming", 550),
            new Book(103, "Data Structures", 600),
            new Book(104, "Web Development", 500),
            new Book(105, "Operating Systems", 700)
        };
        Scanner sc=new Scanner(System.in);
        while (true) {
            
        
        System.out.println("Enter the book title you want to search (exit to end)");
        String target =sc.next();
        if(target.equals("exit")){
            System.out.println("Program end");
            break;
        }
        int k=linearsearch(books,target);
        if(k!= -1){
            System.out.println("Found at "+k);
        }
    }
       
    
    
        }
static int linearsearch(Book b[],String target){
        for(int i=0;i<b.length;i++){
            if(b[i].getname().equalsIgnoreCase(target)){
               return i;
            }

        }
        return-1;
       
    }
    }

