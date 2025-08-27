// -------------------------------
// Java Operator Precedence (highest to lowest)
// -------------------------------
//
// Unary: expr++  expr--
// Prefix: ++expr  --expr  +expr  -expr  ~  !
// Arithmetic: *  /  %
// Additive: +  -
// Shift: <<  >>  >>>
// Relational: <  >  <=  >=  instanceof
// Equality: ==  !=
// Bitwise AND: &
// Bitwise XOR: ^
// Bitwise OR: |
// Logical AND: &&
// Logical OR: ||
// Ternary: ? :
// Assignment: =  +=  -=  *=  /=  %=  &=  ^=  |=  <<=  >>=  >>>=

public class _Operator_Types {
    public static void main(String args[]) {

        // -------------------------------
        // Bitwise NOT (~) and Logical NOT (!)
        // -------------------------------
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;

        // basically,  ~x = -(x + 1)
        System.out.println(~a); // -11
        System.out.println(~b); // 9
        System.out.println(!c); // false
        System.out.println(!d); // true


        // -------------------------------
        // Shift Operators
        // -------------------------------
        // Left Shift (<<)
        // n << x = n * (2^x)
        // Example: 5 << 2 = 20

        // Right Shift (>>)
        // n >> x = n / (2^x)   (integer division, remainder discarded)
        // Example: 20 >> 2 = 5

        // Unsigned Right Shift (>>>)
        // >>> = Logical Right Shift → ignores sign, always fills with 0
        // Negatives turn into big positives.


        // -------------------------------
        // Ternary Operator
        // -------------------------------
        // Using Ternary Operator (? :) to find the larger number
        int max = (10 > 20) ? 10 : 20;
        System.out.println("Maximum is: " + max);


        // -------------------------------
        // Arithmetic Promotion Rule
        // -------------------------------
        // In Java, whenever you do arithmetic with types smaller than int (byte, short, char),
        // they are automatically promoted to int before the operation.

        short s1 = 10;
        short s2 = 10;

        // This gives error because (s1 + s2) becomes int,
        // and int can't be directly stored in short
        // s1 = s1 + s2;   // ❌ Compile-time error

        // This works fine because += does implicit typecasting back to short
        s1 += s2;   // ✅ No error
        System.out.println(s1);


        // -------------------------------
        // C++ vs Java Logical Operators
        // -------------------------------
        // In C++: 0 = false, non-zero = true. (1 || true) → true → prints 1.
        // In Java: This won't compile because both sides of || must be strictly boolean.
    }
}
