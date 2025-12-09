import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //taking new variable max
        int max = a;
        if( b>max){
            max = b;
        }
        if(c> max){
            max = c;
        }
        System.out.println(max);

        //taking max function

        int maxvalue = Math.max(a,b);
        int result = Math.max(maxvalue,c);
        System.out.println(result);

        int maximum = Math.max(c,Math.max(a,b));


        //if-else without new element
        if (a > b && a > c) {
            System.out.println(a + " is the greatest");
        } else if (b > c) {
            System.out.println(b + " is the greatest");
        } else {
            System.out.println(c + " is the greatest");
        }
    }
}
