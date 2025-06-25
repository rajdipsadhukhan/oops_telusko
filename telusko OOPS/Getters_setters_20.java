class Human{
    int age;
    String name;
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class Getters_setters_20 {
    public static void main(String[] args) {
        Human hum = new Human();
        hum.setAge(18);
        hum.setName("Rajdip");
        int age = hum.getAge();
        String name = hum.getName();
        System.out.println(age);
        System.out.println(name);
        
    }
    
}
