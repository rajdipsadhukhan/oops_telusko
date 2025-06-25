class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}
public class Upcasting_downcasting_40 {
    public static void main(String[] args) {
        double num = 4.5;
        System.out.println(num);
        int i = (int)num;  // typeCasting
        System.out.println(i);

        A obj = (A) new B(); // Upcasting  Object is of B refer to A (A is superClass B is subClass of it) (if we do not add (A) it still works)
        obj.show1();

        B obj1 = (B) obj; // This is called downCasting
        obj1.show2();
        obj.show1();

    }
    
}
