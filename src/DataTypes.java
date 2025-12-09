import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 10;               // 1 byte
        short s = 200;             // 2 bytes
        int i = 5000;              // 4 bytes
        long l = 10000000000L;     // 8 bytes (note the 'L' at end)

        float f = 5.75f;           // 4 bytes (note 'f' suffix)
        double d = 19.99;          // 8 bytes

        char ch = 'A';             // 2 bytes (single character)
        boolean isJavaFun = true;  // 1 bit (true/false)

        // -------- NON-PRIMITIVE DATA TYPES --------

        String name = "Zainab";               // String object
        int[] numbers = {10, 20, 30, 40};     // Array

        Scanner sc = new Scanner(System.in);  // Scanner class object

        // -------- OUTPUT --------
        System.out.println("----- Primitive Data Types -----");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("char: " + ch);
        System.out.println("boolean: " + isJavaFun);

        System.out.println("\n----- Non-Primitive Data Types -----");
        System.out.println("String: " + name);

        System.out.print("Array elements: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("City: " + city);
    }
}
