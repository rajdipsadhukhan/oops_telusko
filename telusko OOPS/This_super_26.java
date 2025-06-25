class A extends Object{ // without mentioning
    public A(){
        super();
        System.out.println("In A constructor");
    }
    public A(int a){
        super();
        System.out.println("In A int ");
    }
}
class B extends A{
    public char[] marks;
    public B(){
        
        super(); // by default every constructor has super method
        System.out.println("In B constructor");
    }
    public B(int a){
        this();
       // super(a);
        System.out.println("In B int ");
    }
}
public class This_super_26 {
    public static void main(String[] args) {
        
        B obj1 = new B(5);
    }   
    
}
