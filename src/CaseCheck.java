import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);


        if(ch>='a' && ch<='z' ){
            System.out.println(ch + " is in lowercase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println(ch+ " is in UpperCase");
        }else{
            System.out.println("Invalid");
        }
    }
}
