import java.util.Scanner;
class Calculator{
        public int add(int a,int b){
            return a+b;
        }
    }

class Computer{
    public void playMusic(){
        System.out.println("Music playing...");
    }
    public String GetMeAPen(int cost){
        if(cost>=10){
        return "Pen";
        }
        else{
            return "Nothing";
        }
    }
}

    

public class Methods_03 {
    
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 9;
        Calculator C = new Calculator();
        int result = C.add(num1, num2);
        System.out.println("sum:"+result);

        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();

        Computer Com = new Computer();
        String s = Com.GetMeAPen(cost);
        System.out.println(s);
        Com.playMusic();
        sc.close();
    }

    
}
