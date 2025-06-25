class Human{
    private int age; 
    private String name;
    public Human(){
        System.out.println("In constructor"); // Constructor is a special method that has the same name as the class name and it does not have any return type. everytime we create an object the constructor will be called
        age = 10;
        name = "Enter your name";
    }
    public void setAge(int age){
        this.age = age; // this is a keyword which refers the current object which calls the setAge() method here i.e obj object 
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Constructors_23 {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());;
        obj.setAge(11);
        obj.setName("navin");
        // System.out.println(obj.getName());
        // System.out.println(obj.getAge());;
    }
    
}
