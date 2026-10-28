
public class methodoverloading {
    static class calculator{
        int add (int a , int b ){
            return a + b ;
        }
        int add (int a ,int b ,int c ){
            return a + b + c ;
        }
    }
    public static void main(String[] args) {
         calculator mycal = new calculator();
         System.out.println(mycal.add(10,20));
         System.out.println(mycal.add(20, 70, 10));
    }
}