// Interface outside of Main
interface Shape {
    void draw();
    void color();
}

// Implementation classes outside of Main
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    @Override
    public void color() {
        System.out.println("Coloring Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
    @Override
    public void color() {
        System.out.println("Coloring Rectangle");
    }
}

// Enum outside of Main
enum Color {
    RED, GREEN, BLUE
}

// Main class
public class _01_Data_Types {
    public static void main(String[] args) {
        // Primitive data types
        boolean flag = true;
        char ch = 'z';
        int num = 1234;
        byte size = 2;
        short srt = 78;
        double value = 2.4546778;
        float temp = 3.8f;
        long val = 1888889;

        System.out.println("boolean: " + flag);
        System.out.println("char: " + ch);
        System.out.println("integer: " + num);
        System.out.println("byte: " + size);
        System.out.println("short: " + srt);
        System.out.println("double: " + value);
        System.out.println("float: " + temp);
        System.out.println("long: " + val);

        // Strings
        String s1 = "tpointtech";              
        String s2 = new String("Austria");     

        System.out.println("String 1 (without new): " + s1);
        System.out.println("String 2 (with new): " + s2);

        // Arrays
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int member : arr) {
            System.out.print(member + ", ");
        }
        System.out.println();

        // Enum
        Color clr = Color.GREEN;
        System.out.println("Enum value: " + clr);

        // Interface implementations
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("\n-- Shape Outputs --");
        circle.draw();
        circle.color();

        rectangle.draw();
        rectangle.color();
    }
}
