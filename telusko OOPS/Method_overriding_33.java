class A{
    public int add(int a,int b){
        return a+b;
        
    }
   
}
class B extends A{
    public int add(int a,int b){
        return a+b+1;
    }
}
public class Method_overriding_33 {
    public static void main(String[] args) {
        B obj = new B(); 
        int a = obj.add(2,3);
        System.out.println(a);

        // here the code output will be 6 because the add method in class B overrides the add method in class A 

        // Method Overriding in Java means redefining a method in a child (subclass) that is already defined in its parent (superclass).
       
        
    }
    
}
