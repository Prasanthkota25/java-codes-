public class execptionexample{
    public static void main(String[] args) {
        int i =10;
        int j = 0 ;
        try {
             j = 10/0;

        }
        catch (Exception e){
            System.out.println("some thing went wrong ....");
        }
    }
}