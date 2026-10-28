abstract class abstractanimal {
abstract void sound ();

void eat (){
System.out.println("animals are eating" );
}
 static class dog extends  abstractanimal{
 @Override
 void sound (){
 System.out.println("dog bakring ");
 }
 }
 public static void main (String [] args ){
 
 abstractanimal a =new dog ();
  a.eat();
 a.sound ();

 }
 }