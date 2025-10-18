import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(45);
        // list.add(54);
        // list.add(89);
        // list.add(22);
        // list.add(56);
        // list.add(80);
        // System.out.println(list.contains(22));
        // System.out.println(list);
        //list.set(1,50);
        for(int i = 0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        sc.close();
        


    }
    
}
