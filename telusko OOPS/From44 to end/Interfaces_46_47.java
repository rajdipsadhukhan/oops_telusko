interface A{ // instead of using abstract class we are using interface which is not a class
    int age=18; // final and static
    String area = "Mumbai"; 
    void show();
     void config(); // by default all the methods inside an interface is public and absract


    
}
interface X{
    void run();
}
interface Y extends X{ // inheritance is valid in case of 2 interfaces

}
class B implements A,X{ // one class implementing multiple interfaces
    // we should define the methods in interface A
    public void show(){
        System.out.println("In show");

    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("Running...");
    }

}
public class Interfaces_46_47 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
        X obj1 = new B();
        obj1.run();

        // class - class extends
        // class - interface implements
        // interface - interface extends
        
    }
    
}
