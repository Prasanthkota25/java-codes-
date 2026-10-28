public class methodoverriding {
    static class Banks  {
        void payments (){
            System.out.println("your paymetns are done by the from X bank...");
        }
    }
    static class Sbi extends Banks{
        @Override
        void payments(){
            System.out.println("your payment done through the Sbi Bank ....");
        }
    }
    public static void main(String[] args) {
        Banks mybank = new Sbi();
        mybank.payments();
    }
}

