import java.util.Scanner;
public class printAllSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        for(int i=0;i<s.length()+1;i++){
            for(int j=i+1;j<s.length()+1;j++){
                 System.out.println(s.substring(i,j));
            }
           
        }
        sc.close();
    }
    
}
