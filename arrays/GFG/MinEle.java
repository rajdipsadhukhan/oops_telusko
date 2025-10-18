import java.util.Scanner;
public class MinEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter 5 elements:");
          for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = MinNum(arr);
        System.out.println("Min ele:"+result);
        sc.close();
    }
    static int MinNum(int arr[]){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
