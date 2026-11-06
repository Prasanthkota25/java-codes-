//  Polymorphism MethodOverloading ..... 
// compile-time Polymorphism...



//  compile-time Polymorphism when multiple  methods have the same name  but the diffrent  parameters .
// the method call is resoveld at compile-time ..... 





public class calculator {

int add (int a,int b) {
return  a+b;
}
int add (int a ,int b ,int c ){
return a+b+c;
}
double add (double a , double b , double c ){

return a+b+c ;
}

public static void main (String [] main ){

calculator mycal = new calculator();

System.out.println(mycal.add(10,20)); 
System.out.println(mycal.add(5,10,15)); 
System.out.println(mycal.add(10,20,70)); 
}
}
