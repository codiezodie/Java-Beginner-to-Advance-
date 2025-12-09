import java.util.ArrayList;
import java.util.Scanner;

public class CountOcurUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;

        System.out.println("Enter elements (enter -1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {     // stop input condition
                break;
            }
            arr.add(num);        // add to ArrayList

            if (num == 7) {      // count as you input
                count++;
            }
        }

        System.out.println("Frequency of 7 is: " + count);
    }
}
