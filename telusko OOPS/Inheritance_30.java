import calculators.AdvCalc_inheritance;
import calculators.VeryAvdCalc_inheritance;

public class Inheritance_30 {
    public static void main(String[] args) {
        // Calc c = new Calc();
        // int res = c.add(2 ,3);
        // System.out.println(res);
        AdvCalc_inheritance c1 = new AdvCalc_inheritance();
        int add = c1.add(2, 3);
        int sub = c1.sub(2,3);
        int mul = c1.multi(3,4);
        float div = c1.div(14, 2);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        VeryAvdCalc_inheritance obj = new VeryAvdCalc_inheritance();
        double ans = obj.power(2,5);
        System.out.println(ans);


    }
    
}
