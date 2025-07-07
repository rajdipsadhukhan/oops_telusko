abstract class A{
    public abstract void show();
    public abstract void config();
        
}

public class Abstract_anonymous_inner_44 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In anonymous show");
            }
            public void config(){
                System.out.println("In config");
            }
        };
        obj.show();
        obj.config();
        
    }
    
}
