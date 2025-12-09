import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp=0;
        int rev =0;
        while (n > 0) {
            rev = n % 10;
            temp = temp *10+ rev;
            n = n / 10;
        }
        System.out.println("Reversed Number:" +temp);

    }
}
