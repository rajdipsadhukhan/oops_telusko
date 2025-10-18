import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Manipulation(arr);
        sc.close();
    }
    static void Manipulation(int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(i%2 != 0){
                arr[i] = arr[i] * 2;
            }
            else{
                arr[i] = arr[i] + 10;
            }
        }
        System.out.println("Modified Array:");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
