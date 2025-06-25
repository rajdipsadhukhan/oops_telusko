public class Mutable_immutable_15 {
    public static void main(String[] args) {
        String name = "navin";
        name = name+" Reddy";
        System.out.println(name);
        String s1 = "Raj";
        String s2 = "Raj";
        System.out.println(s1==s2); // by default strings are immutable 
    }
}
