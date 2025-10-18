import java.util.*;
public class sumOfSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number String:");
        String s = sc.next();
        int sum = 0;
        for(int i = 0;i<=s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                int n = Integer.parseInt(sub);
                sum = sum + n;
            }
        }
        System.out.println("Sum of substrings: "+sum);
        sc.close();
    }

}
