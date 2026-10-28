public class interfaceExample {

     static  interface Animals {
        void sound();
    }
    static class Dog implements Animals{
        @Override
        public void sound(){
            System.out.println("Your Dog is makeing the noise ...");
        }
    }

    public static void main (String[] args ){
       Animals  mydog = new Dog();
       mydog.sound();
    }
}