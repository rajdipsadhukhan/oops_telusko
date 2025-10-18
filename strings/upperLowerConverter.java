import java.util.*;
public class upperLowerConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int c = s.charAt(0);
        if(c>=97 && c<=122){
            s = s.toLowerCase();
        }
        else{
            s = s.toUpperCase();
        }
        System.out.println("converted string: "+s);
        sc.close();
    }
    
}
