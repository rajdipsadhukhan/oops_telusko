class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

}
public class Methods_overloading_05 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int res = obj.add(4,5,6);
        System.out.println("sum:"+res);
        /*same methods names with same return type 
        but they have different parameters this is termed as method overloading
         */ 

    }
    
}
