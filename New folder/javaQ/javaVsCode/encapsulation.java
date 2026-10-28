public class encapsulation {
static class Employee {
    private int Balance ;

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
       this.Balance = balance;
    }
}
public static void main(String[] args) {
    Employee myemp = new Employee();
    myemp.setBalance(500000);
    System.out.println( "Employee Balance is : " + myemp.getBalance());
}
    
} 