class Human{
    private int age; 
    private String name;
    public Human(){ // default constructor
        System.out.println("In constructor"); // Constructor is a special method that has the same name as the class name and it does not have any return type. everytime we create an object the constructor will be called
        age = 10;
        name = "Enter your name";
    }

    public Human(int a,String n){ // parametrized constructor 
        age = a;
        name = n;

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
public class Default_parameterized_constructor_24 {
    public static void main(String[] args) {
            Human obj = new Human();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());;
        obj.setAge(11);
        obj.setName("navin");
        Human obj1 = new Human(16,"Rajdip");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());;
        

    }
    
}
