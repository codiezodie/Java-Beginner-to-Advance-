import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,8,5,7,7,7,7,8,7,9};
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==7){
                count++;
            }

        }
        System.out.println(count);
    }
}
