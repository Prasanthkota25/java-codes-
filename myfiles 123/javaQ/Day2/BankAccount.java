   //Abstraction .....
   
   
   
   // Abstraction is the process  of the hinding internal  implemwntation  detials and showing  only essential functionality to the  user .
   
   
abstract class BankAccount {

 abstract void withdraw();

void deposit(){
System.out.println("deposit your money in the ATM ");
}

static class Atm extends BankAccount {
@Override

void withdraw(){
System.out.println("you can take your money by ATM card ");
}
}
public static void main (String [] args ){

BankAccount myAcc = new Atm ();
myAcc.deposit();
myAcc.withdraw();
}
}
