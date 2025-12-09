import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        int count = 2;
        int sum =0;
        int firstnum=0;
        int secondnum = 1;
        while(count<= range) {
            sum = firstnum + secondnum;
            count++;
            firstnum = secondnum;
            secondnum = sum;

        }
        System.out.println(sum);
    }
}
//0->0