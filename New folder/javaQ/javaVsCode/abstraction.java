
public class abstraction {

   static  abstract class Animal{
        abstract void sound ();
        void eat (){
            System.out.println("Animals are eating the Food ...");
        }
    }
     static   class Dog extends Animal{
        @Override
         void sound(){
            System.out.println("Dog is barking ....");
         }
    }
public static void main(String[] args) {
    Animal myDog =new Dog();
    myDog.sound();
    myDog.eat();
}
}
