public class InterningNew {
    public static void main(String[] args) {
        String s1 = new String("Rajdip");
        String s2 = new String("Rajdip");
        System.out.println(s1==s2); // locations of s1 and s2 are not same so it will give false
        System.out.println(s1.equals(s2)); 

    }
    
}
