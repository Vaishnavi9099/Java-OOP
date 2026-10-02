public class toosmallandtoobigException {
    public static void main(String[] args) {
        String text;
        try{
            text=Test.convert("Hello...");
            System.out.println(text);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            text=Test.convert("Welcome Guys");
            System.out.println(text);
        }
        catch( Exception e){
            System.out.println(e);
        }
        try{
            text=Test.convert("I am proud to be Indian");
            System.out.println(text);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
