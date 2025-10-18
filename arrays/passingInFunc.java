import java.util.Arrays;

public class passingInFunc {
    static void change(int[] arr){
        arr[2] = 56;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr)); // arrays are mutable in java
        

    }
}
