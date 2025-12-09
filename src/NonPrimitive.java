import java.util.Scanner;

public class NonPrimitive {
    public static void main(String[] args) {
        System.out.println("Non-Primitive");
        //Non-primitive types are objects.
        //They store references (addresses) pointing to memory (heap).
        //String, Arrays, Class objects, Interfaces, HashMap, ArrayList .
        //example:-

        String name = "Zainab"; //sequence of characters
        int[] arr = {1,2,3};    //collection of elements of same type.
        Scanner sc = new Scanner(System.in); //created from a class
        Runnable r;  //reference to interface

    }
}
