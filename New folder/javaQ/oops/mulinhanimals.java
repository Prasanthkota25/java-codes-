public class mulinhanimals {

void sound (){
System.out.println(" animals  makes sound ");
}
static class dog extends mulinhanimals{
void bark(){
System.out.println("dog is barking ");
}
}
static class puppy  extends dog{
void sleep (){
System.out.println(" puppy is sleeping ");
}
}
public static void main(String [] args ){
 puppy d =new puppy();
 d.sound();
 d.bark();
 d.sleep();
 }
 }