import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        // input using for loops
        for(int i =0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
       for(int n:arr){
            System.out.println(n); // enhanced for loop
       }
       sc.close();
    }
    
}
