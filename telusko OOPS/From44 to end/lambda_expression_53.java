@FunctionalInterface
interface A{
    void show(int i);
}
public class lambda_expression_53 {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in a show "+i);// this is called as lambda expression
            
                
            
        ;
        obj.show(4); // we cam use lambda expression only in functional interface

    }
    
}
    

