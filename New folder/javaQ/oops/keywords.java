public class keywords {

String colour = "black ";

static class dog extends keywords{
String colour = "white";
void dispaly(){

System.out.println( super.colour);
System.out.println(colour);
}
}
public static void main (String  [] args ){

dog key = new dog ();
key.dispaly();
}
}