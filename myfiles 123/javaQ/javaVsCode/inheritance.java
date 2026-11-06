public class inheritance {
    
    static class Animal {
        void sound (){
            System.out.println("Animal makes sounds...");
        }
    }
    static class Dog extends Animal {
        void bark(){
            System.out.println("Dog is barking ...");
        }
    }
    public static void main(String[] args) {
        Dog mydog = new Dog();
        
        mydog.bark();
        mydog.sound();

    }
}
