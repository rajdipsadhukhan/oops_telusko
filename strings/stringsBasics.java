import java.util.Scanner;
public class stringsBasics{
    public static void main(String[] args) {
        // char[] arr = {'p','r','i','y','a'};
        // for(char ele:arr){
        //     System.out.print(ele);
        // }
        Scanner sc = new Scanner(System.in);
        // String s = "susmita is good vivek is also good";
        String s = sc.next(); // ignore spaces and stops when one space came
        System.out.println(s);
        String str = sc.nextLine(); // takes full string
        System.out.println(str); 
        sc.close();


    }
}
