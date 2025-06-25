class Human{
    private int age; 
    private String name;
    
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
public class This_keyword_22 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("navin");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());;
        
    }
    
}
