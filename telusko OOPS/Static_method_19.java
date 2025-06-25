class Mobile2{
    public static void show1(){
        System.out.println("in show1 method");
    }
}
public class Static_method_19 {

    public static void main(String[] args) {
        Mobile2.show1(); // we can call a static method directly with a class name 
        // the same is not applicable for a non static method
    }
    
}
