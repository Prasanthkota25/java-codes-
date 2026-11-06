public class bankaccount {
private double balance ;

public double getBalance (){

return balance ;
}
public void setBalance (double balance){
if(balance>0){
	this.balance=balance;

}
else{
System.out.println("invalied balance");
}
}
public static void main(String  [] args ){

bankaccount account = new bankaccount();
account.setBalance(50000);
System.out.println("balance :" + account.getBalance()); 
}
}
