interface A {
    void Show();

}

public class demos {

    public static void main(String a[] ) {
        A my = new A() {
           public  void Show() {
                System.out.println("in Show ");
            }
        };
        my.Show();
    }
}