import java.util.Scanner;

public class InANumberCountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10; // store the last digit in rem
                        // %->gives remainder
            if(rem == 7){ // if last digit is 7 then count will get incremented.
                count++;
            }

            n = n/10;// after this we'll remove the last digit by taking the modulo 346/10->34 store again on n to compute further.
        }           //   / -> gives quotient

        System.out.println(count);
    }
}

