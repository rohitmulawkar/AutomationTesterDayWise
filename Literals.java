public class Literals {
    public static void main(String[] args) {
//  1 Integer literals
        int hexadecimal = 0x1B;   // Hexadecimal (base 16)
        int binary = 0b10;      // Binary (base 2)
        int octal = 012;          // Octal (base 8)
        int decimal = 1000;        // Decimal (base 10)

// 2. Floating-Point Literals
        double pi = 3.14159;      // Standard notation (double by default)
        float gravity = 9.81f;    // Float requires an 'f' suffix
        double scientific = 3.5e2; // Scientific notation (3.5 × 10^2)
// 3. Character Literals
        char letter = 'C';        // Single character
        char newline = '\n';      // Escape sequence for newline
        char unicodeChar = '\u0041'; // Unicode representation for 'A'
// 4. String Literals
        String greeting = "Hello, World!";
        String emptyString = "";   // An empty string
        String multiline = "Line 1\nLine 2"; // Using escape sequence for new line
// 5. Boolean Literals
        boolean isJavaFun = true;   // True value
        boolean isFishTasty = false; // False value
// 6. Null Literal
        String name = null;         // String variable with null value
        Integer number = null;      // Integer object reference with null value

    }
}
