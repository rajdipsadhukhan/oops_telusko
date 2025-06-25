class Computer{

}
class Laptop extends Computer{

}
class A{
    public void show(){
        System.out.println("In A show");
    }

}
class B extends A{
     public void show(){
        System.out.println("In B show");
    }

}

public class Dynamic_method_dispatch_37 {
    public static void main(String[] args) {
        A obj = new A(); // works
        obj.show();
        Computer obj1 = new Laptop(); // obj1 is reference of Computer which technically is a Laptop

        obj = new B(); // obj refering the object of B
        obj.show(); // Polymorphism example 

        
    }
    
}
