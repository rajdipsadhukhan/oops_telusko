public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rajdip");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append(" Sadhukhan");
        System.out.println(sb);
        sb.setCharAt(0, 'A');
        System.out.println(sb);
    }
    
}
