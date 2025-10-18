import java.util.Scanner;
public class MaxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = MaxNum(arr);
        System.out.println("Max element:"+result);
        sc.close();
    }
    static int MaxNum(int arr[]){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    }
    
}
