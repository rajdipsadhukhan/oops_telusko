@FunctionalInterface
interface A{
    int add(int i,int j);
}
public class lambda_with_return_54 {
    public static void main(String[] args) {
        A obj = (int a,int b) -> a+b; // cannot mention return 
           
        ;
        int result = obj.add(3,4);// we cam use lambda expression only in functional interface
        System.out.println(result);
        
    }
    
}
