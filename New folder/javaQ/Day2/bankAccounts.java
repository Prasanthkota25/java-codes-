// interface .....

//  An interface in java is used to achieve 100% abstraction  
// it contains the method declaration (with out implement ) and a class must implement thos methods .

interface bankAccounts {
void  withdraw();
 
 default  void deposit(){
 System.out.println("You can deposit your money in ATM  Center ...");
 }
 static class Atm implements bankAccounts{
 
  public void withdraw(){
 System.out.println("You can withdraw your money in Atm ...");
 }
 }
 public static void main (String [] args ){
 
 Atm myacc = new Atm();
 myacc.deposit();
 myacc.withdraw();
 }
 }