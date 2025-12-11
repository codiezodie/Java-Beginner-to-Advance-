import java.util.Scanner;
import java.util.SortedMap;

public class SwitchFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your Favourite fruit?:");
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits!");
                break;
            case "Apple":
                System.out.println("red Fruit");
                break;
            case "Orange":
                System.out.println("Sweet & sour fruit");
                break;
            default:
                System.out.println("Invalid Fruit!");
        }
    }
}
