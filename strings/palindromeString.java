import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int j = str.length()-1;
        int count = 0;
        while(i<=j){
            if(str.charAt(i)!= str.charAt(j)){
                count++;
            }
            i++;
            j--;

        }
        if(count!=0){
            System.out.println("not palindrome");

        }
        else{
            System.out.println("palindrome");
        }
        sc.close();


        }
    }
    

