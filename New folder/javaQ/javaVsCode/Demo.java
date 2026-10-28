enum Lpatop {
    Dell(20000),Thinkpad(50000),MacBook(5000000),Hp(200000);

   private int price;

   private Lpatop(int price) {
    this.price = price;
}

   public int getPrice() {
    return price;
}

   public void setPrice(int price) {
    this.price = price;
}

    
}

public class Demo {

    public static void main(String[] args) {
       
      //  Lpatop lap =  Lpatop.Dell;
       // System.out.println(lap + ":"+ lap.getPrice());

       for(Lpatop lap : Lpatop.values()){
        System.out.println(lap + " : "+lap.getPrice());
       }
    }
}