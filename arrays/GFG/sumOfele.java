import java.util.Scanner;
class sumOfele{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter 5 elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum = arr[i]+sum;
        }
        System.out.println("Sum of elements is:"+sum);
        sc.close();

    }
}
