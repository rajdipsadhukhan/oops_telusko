interface Computer{
     void code(); // methods in interfaces are public by default

    
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code,compile,run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code,compile,run"+" faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
    
}
//
public class Need_of_interfaces_45 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer raj = new Developer();
        raj.devApp(desk);
        raj.devApp(lap);

        /*In Java, an interface is a blueprint for a class. It is used to achieve abstraction and multiple inheritance in Java. An interface can contain:

Abstract methods (without body)

Static methods

Default methods

Constants (public, static, final) */

        /*✅ Key Points:
All methods in an interface are public and abstract by default.

Variables in interfaces are public, static, and final.

A class can implement multiple interfaces.

Interfaces support default and static methods from Java 8. */


        
    }
    
}
