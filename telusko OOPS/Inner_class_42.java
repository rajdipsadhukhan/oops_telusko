class A{
    int age;
    public void show(){
        System.out.println("In A show");
    }
    class B{
        public void config(){
            System.out.println("In config");
        }
    }
    static class C{ // we can only make inner class static 
        public void showC(){
            System.out.println("In C show");
        }
    }
}
public class Inner_class_42 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C(); // here it is possible because the class C is static
        obj2.showC();
        
    }
    
}
