import java.util.Scanner;

public class Array_creation_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {1,2,3,4,5};
        System.out.println(num[1]);
        int num1[] = new int[4];
        for(int i=0;i<4;i++){
             num1[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
             System.out.println(num1[i]);
        }
        sc.close();
    
    }
    
}
