import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string 1:");
        String s1 = sc.next();
        
        System.out.println("Enter string 2:");
        String s2 = sc.next();
        
        // If lengths differ, they cannot be anagrams
        if(s1.length() != s2.length()) {
            System.out.println("Not anagram");
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            if(Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        }
        
        sc.close();
    }
}
