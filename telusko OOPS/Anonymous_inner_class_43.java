class A{
    public void show(){
        System.out.println("In A show");
    }
}
/*class B extends A{
    @Override // just a annotation showing overriding
    public void show(){
        System.out.println("In B show");
    }
} */
public class Anonymous_inner_class_43 {
    public static void main(String[] args) {
        A obj = new A(){ // inner class anonymous
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();


        
    }
    
}
