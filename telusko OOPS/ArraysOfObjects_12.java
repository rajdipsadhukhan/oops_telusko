class Student{
    int rollNo;
    String name;
    int marks;
}
public class ArraysOfObjects_12 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks=98;
        s1.name = "Navin";
        s1.rollNo = 1;
        Student s2 = new Student();
        s2.marks=58;
        s2.name = "Raj";
        s2.rollNo = 2;
        Student s3 = new Student();
        s3.marks=87;
        s3.name = "Subha";
        s3.rollNo = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        // For printing the details of the students
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" : "+students[i].marks);

        }

        // using enhanced for loop
        for(Student stud : students ){
            System.out.println(stud.name);

        }
        /* int nums[] = new int[6];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    } */
    
     }
}
