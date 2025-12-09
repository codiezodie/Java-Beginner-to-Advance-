public class Primitives {
    public static void main(String[] args) {
        System.out.println("Primitive Data-Types:");
        //Primitive data-type
        //Primitive types are built-in data types in Java.
        //They store simple values directly in memory (not objects).
        //byte, short, int , long, float , double, char , boolean
        byte a = 10; //small integer value.
        short b = 1000; // larger tha bytes
        int c = 64; // most common integer type.
        long d = 123456789L; // very large integers.
        float e = 1.5f; //decimal numbers
        double f = 3.14159; // more precise decimal
        char g = 'A'; //single character.
        boolean h = true; // true/false

        //example
        int age = 20;
        double price = 99.50;
        boolean isJavaFun = true;
        char grade = 'A';

        //Wrapper Class
        Integer rollno = 90;
        System.out.println(rollno.intValue());

    }
}
