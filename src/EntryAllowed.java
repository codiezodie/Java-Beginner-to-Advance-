import java.util.Scanner;

public class EntryAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of the individual:");
        int age = sc.nextInt();
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Underage");
        }

    }
}
