@FunctionalInterface
interface A{
    void show();
}
/*class B implements A{
    public void show(){
        System.out.println("in show");
    }
}
    */
public class functional_interface_52 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in a show");
            }
        };
        obj.show(); // we cam use lambda expression only in functional interface

    }
    
}
