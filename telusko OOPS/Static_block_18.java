class Mobile1{
    int price;
     static String name;
    String brand;
    static{
        name = "phone";
        System.out.println("in static block");
    }
    public Mobile1(){ // constructor
        price = 200;
        brand=" ";
        System.out.println("in constructor");
        
    }
}
public class Static_block_18 {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile1 obj1 = new Mobile1();
        // Mobile1 obj2 = new Mobile1();
        
        // for there is class loader the static block code runs 1 time 
        // but every time a object is created the constructor runs so it runs 2 times
        // if we do not create object the static block will not executed

        //To execute the static block we should use---
        Class.forName("Mobile1");

    }
    
}
