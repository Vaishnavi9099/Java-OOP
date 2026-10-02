public class CheckedException {
    public static void main(String[] args) throws Exception  {
        int i=0;
        for(i=0;i<5;i++){
            System.out.println("Number of Itreation= "+i);
            System.out.println("Wait...");
            Thread.sleep(2000);
        }
    }
}
