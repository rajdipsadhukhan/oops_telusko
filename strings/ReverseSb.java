public class ReverseSb {
    public static void main(String[] args) {
        String s = "Rajdip";
        StringBuilder sb = new StringBuilder(s);
        // sb.append(" Sadhukhan");
        System.out.println(sb);
        // sb.reverse();
        // int i = 0;
        // int j = sb.length()-1;
        // while(i<=j){
        //     char temp1 = sb.charAt(i);
        //     char temp2 = sb.charAt(j);
        //     sb.setCharAt(i, temp2);
        //     sb.setCharAt(j, temp1);
        //     i++;
        //     j--;
        // }
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(3, 'd');
        System.out.println(sb);

        sb.delete(3, 6);
        System.out.println(sb);
        sb.toString();
        System.out.println(sb); // string
    }
    
}
