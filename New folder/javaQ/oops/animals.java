interface  animals {

void sound ();
static class dog implements animals{

@Override
public void sound (){
System.out.println("dog is barking ");
}
}
public static void main (String [] args ){
animals  a = new dog ();
a.sound();

}
}