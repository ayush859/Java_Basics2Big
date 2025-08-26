

public class _01_Variable {  
    public static void main(String[] args) {  
        // Local variable
        int num = 10;  
        System.out.println("Variable: " + num);

        // Object creation (for instance variables)
        InstanceVariableDemo obj = new InstanceVariableDemo();  
        System.out.println("Student Name is: " + obj.name);  
        System.out.println("Student Age: " + obj.age);    

        // Static variable (shared among objects)
        Student s1 = new Student();  
        Student s2 = new Student();  
        s1.age = 24;  
        s2.age = 21;  
        Student.age = 23;  
        System.out.println("S1's age is: " + s1.age);  
        System.out.println("S2's age is: " + s2.age);  
    }  
}  

// Instance variable → object-specific
// It is called an instance variable because its value is instance-specific
// and is not shared among instances.
class InstanceVariableDemo {  
    public String name;  
    public int age = 19;  

    // Constructor
    public InstanceVariableDemo() {  
        this.name = "Deepak";  
    }  
}  

// Static variable → one copy shared by all objects
// Memory allocation for static variables happens only once 
// when the class is loaded in the memory.
class Student {  
    static int age;  
}  

// A local variable cannot be declared with "static" keyword.