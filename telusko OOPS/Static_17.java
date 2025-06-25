class Mobile{
    String brand;
    static String name; // using static keyword ...you are making somethig class member not
    // object member
    int price;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

}
public class Static_17 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        Mobile.name="Smartphone";
        obj1.price=1700;

        Mobile obj2 = new Mobile();
        obj2.brand="Redmi";
        Mobile.name="Smartphone";
        obj2.price=1200;

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        
    }
    
}
