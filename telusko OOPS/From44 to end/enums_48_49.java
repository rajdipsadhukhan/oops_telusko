enum Status{ // Status is a class 
    Running , Failed , Pending , Success ; // These are the objects of Status
}
public class enums_48_49 {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        Status arr[] = Status.values();
        System.out.println(arr[2]);
        
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+ ":"+i);
        }
        Status s1 = Status.Pending;
        if(s1 == Status.Running){
            System.out.println("All good");
        }
        else if(s1 == Status.Failed){
            System.out.println("Try again");
        }
        else if(s1 == Status.Pending){
            System.out.println("Please wait");
        }
        else{
            System.out.println("Done");
        }
        // we can do it by switch case also 
        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Done");
        }

    }
    
}
