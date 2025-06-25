public class Stack_heap_06 {
    public static void main(String[] args) {
        /*
         * 1. Stack Memory
🔹 What is it?
Stack memory stores methods, local variables, and the order of method calls.

It works like a stack of plates — last in, first out (LIFO).

🔹 Example:
java
Copy
Edit
public void show() {
    int x = 5;  // 'x' is stored in Stack
}
🔹 Key Points:
Fast and small.

Automatically managed.

Each thread has its own Stack.

When the method ends, local variables are removed from the stack.

✅ 2. Heap Memory
🔹 What is it?
Heap memory is used to store objects and instance variables (i.e., variables inside a class).

It’s shared by all threads.

🔹 Example:
java
Copy
Edit
class Student {
    int age = 20;
}

Student s = new Student();  // 's' is a reference in Stack, object is in Heap
🔹 Key Points:
Bigger than Stack.

Slower than Stack.

Managed by Java Garbage Collector (removes unused objects automatically).


         */
    }
    
}
