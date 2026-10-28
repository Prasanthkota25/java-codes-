   //Encapsulation .....
   
   // Encapsulation is the process of the binding the data and method  together into a single class  
   // restriciting the direct access  to the data 
   // using the private variable and  public getters /setters  methods .......
   
   
   
   
   
   public class Bank {
private int balance ;

public int getBalance (){
return balance;
}
public void setBalance(int balance){
this.balance = balance;
}

public static void main (String [] args ){

Bank myAcc = new Bank();
myAcc.setBalance(500000);
System.out.println(myAcc.getBalance());
}
}