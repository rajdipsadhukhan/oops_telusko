
public class MultiDimen_Array_09 {
    public static void main(String[] args) {
        
        int num[][] = new int[2][2]; // multidimensional array
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                num[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
    
    

