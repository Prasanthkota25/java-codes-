
/*
interface A{
    void Show ();
}

public class lamda{
    public static void main (String []args){
      
        A mya = () -> System.out.println("its my show.........");
        
        mya.Show();
    }
}
    */


@FunctionalInterface
interface A {
    void show();
}
public class lamda {

     public static void main(String[] args) {
         A obj = () -> System.out.println("its my Show ....");
        obj.show();
     }
}