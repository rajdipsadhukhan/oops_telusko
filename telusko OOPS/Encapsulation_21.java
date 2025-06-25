class Human{
    private int age; // this age variable is accesible only in this class
    private String name;
    // To access any private variables here intances variable in different class we should use methods
    /*Encapsulation in Java is the process of hiding the internal details of a class and only exposing necessary parts through public methods.

Easy Definition:
Encapsulation means binding data and methods together and restricting direct access to some of the object’s components. */
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation_21 {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "navin";
        obj.setAge(11);
        obj.setName("Satish");
        System.out.println(obj.getName()); 
        System.out.println(obj.getAge());

    }
    
}
