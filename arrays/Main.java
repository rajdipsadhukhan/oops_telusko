import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // store 5 roll numbers
        int arr[] = new int[5]; // all the datas should be same data type.
        // array mean collection of similar data types.
        // int arr[] declaration of array. arr is getting defined in stack . this happens in compile time
        // arr = new int[5] actually here the object is created in heap. this happens in runtime.
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt(); // continuos memory allocation.
        }
        // stack
        // arrays objects are in heap
        // heap objects are not continuos
        // DMA
        // hence array object in java may not be continuos. It depends on JVM because heap stack memory all are in JVM.
        // new is used to create an array object of size 5;
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}