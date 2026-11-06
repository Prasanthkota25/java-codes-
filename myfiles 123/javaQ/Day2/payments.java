  //  Polymorphism MethodOverrideing .....
  // Run-time Polymorphism
  
  
  
  // when a subclass provides a specific  implementation  of a method already  defined in its  superclass 
// the method call is resovled at runtime  based on the object .  

public class payments {

void pay (){
System.out.println("You can Withdraw your money through Atm ...");
}

static class onlinepayments extends payments{
@Override 
void pay(){
System.out.println("You can done your payments through online Apps ....");
}
}
public static void main (String [] args ){

payments mypayments ;

mypayments = new onlinepayments();
mypayments.pay();
}
}
