 // Inheritance .....
 
 
 // in java that allows one class to acquire  the fields  and methods  of another class  using the extends keyword .
 // it represents the  "is-a " relationship  between class 
 // child class  acquire the fields and methods of the parent class using the Extend Keyword.

public class cars {

void color (){
System.out.println(" my car color is Black ...");
}

static class Bmw extends cars {

 void  model(){
 System.out.println("my car model is BMW X5 ...");
 }
 }
 public static void main(String [] args ){
 Bmw  myCar = new Bmw ();
 myCar.model();
 myCar.color();
 }
 }
 