public class builtInMethods {
    public static void main(String[] args) {
        String str = "Rajdip Sadhukhan";
        System.out.println(str.indexOf('p'));
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("adhu"));
        System.out.println(str.startsWith("Raj"));
        String s1 = "Raghav";
        String s2 = "Raju";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        String s = "6435425";
        int n = Integer.parseInt(s);
        System.out.println(n+1);
    }
    
}
