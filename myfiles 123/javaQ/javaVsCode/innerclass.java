public class innerclass{
    static class A {
        public void Show (){
            System.out.println("in A Show ");
        }
    }
    public static void main (String [] args ){
        A obj = new A(){
            public void Show(){
                System.out.println("in New Show ...");
            }
        };
        obj.Show();

    }
}