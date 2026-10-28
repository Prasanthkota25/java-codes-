public class animal {

 void sound (){
System.out.println("aminals make sounds ");
}

  static class dog extends animal{ 
@Override
void  sound(){
System.out.println("dog barks ");
}
}

public static void main (String [] args ){
	
	animal a = new animal();
	a.sound();
	
	a= new dog();
	a.sound();
}
}public class animal {

 void sound (){
System.out.println("aminals make sounds ");
}

  static class dog extends animal{ 
@Override
void  sound(){
System.out.println("dog barks ");
}
}

public static void main (String [] args ){
	
	animal a = new animal();
	a.sound();
	
	a= new dog();
	a.sound();
}
}