 public class inhanimals {
 
 void sound (){
 System.out.println(" aimals are meking the sounds ");
 }
 static class dog  extends inhanimals{
 void bark(){
 System.out.println("dog is barking ");
 }
 }
 public static void main (String [] args ){
 
 dog a = new dog ();
 a.sound();
 a.bark();
 }
 }
 