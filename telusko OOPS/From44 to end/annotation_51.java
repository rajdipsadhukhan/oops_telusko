class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}
public class annotation_51 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
    
}
