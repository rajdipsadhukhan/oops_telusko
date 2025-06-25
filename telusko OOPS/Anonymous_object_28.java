class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in A show");
    }
}
public class Anonymous_object_28 {
    public static void main(String[] args) {
        new A(); // is object creation **** anonymous object ****
        new A().show();
       
    }
    
}
