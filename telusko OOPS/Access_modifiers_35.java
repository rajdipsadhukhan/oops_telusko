import other.A;
public class Access_modifiers_35 {
    public static void main(String[] args) {
        A obj = new A();
       // System.out.println(obj.marks); not acessible until the variable marks is not public
        obj.show();

       B obj1 = new B();
       System.out.println(obj1.marks);
      
        
    }
    
}
