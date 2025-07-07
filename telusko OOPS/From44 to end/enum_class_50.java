enum Laptop{
    Macbook(2000),XPS(2200),Surface(1800),Thinkpad(1500);
    private int price;

    private Laptop(int price){ // constructor
        this.price = price ;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class enum_class_50 {
    public static void main(String[] args) {
       // Laptop lap = Laptop.Macbook;
       // System.out.println(lap+ " "+ lap.getPrice());
        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }

    }
    
    
}
