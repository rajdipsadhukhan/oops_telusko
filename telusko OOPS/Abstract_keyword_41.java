abstract class Car{ // class should be abstract 
    // abstract class can have both abstract methods or normal methods but viceversa not true
    public abstract void drive(); // here we want to declare a method we use keyword abstract
    public abstract void fly();

    
    public void playMusic(){
        System.out.println("Play music");
    }
}
abstract class WagonR extends Car{ // this class WagonR is abstract because it cannot implement the fly method
     public void drive(){
        System.out.println("Driving");
     }


}
class UpdatedWagonR extends WagonR{ // concrete class
    public void fly(){
        System.out.println("Flying");
    }
}
public class Abstract_keyword_41 {

    public static void main(String[] args) {
      //  Car obj = new Car(); we cannot create object of an abstract class
      //  obj.drive();
      //  obj.playMusic();
      //Car obj = new WagonR(); we cannot create object of an abstract class
      //obj.drive();
      //obj.playMusic();
      Car obj = new UpdatedWagonR();
      obj.drive();
      obj.fly();
      obj.playMusic();
    }
}
