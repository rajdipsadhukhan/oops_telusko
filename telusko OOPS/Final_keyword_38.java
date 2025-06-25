// final - variable , method, class
/*final*/ class Calc{ // this final keyword refers that we cannot inherit the class Calc
    public /*final*/ void show(){ // this final stops method overriding
        System.out.println("By me");
    }
    public void add(int a,int b){
        System.out.println(a+b);

    }
}
class AdvCalc extends Calc{
    public void show(){
        System.out.println("By someone");
    }
}


public class Final_keyword_38 {
    public static void main(String[] args) {
        int num = 8;
        num = 9;
        System.out.println(num);

        Calc obj = new Calc();
        obj.add(3,4);

        AdvCalc obj1 = new AdvCalc();
        obj1.show();
        obj1.add(3, 1);
        
    }
    
}
