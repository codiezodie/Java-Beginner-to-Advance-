import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID:");
        int empID = sc.nextInt();

        System.out.print("Enter Employee Department:");
        String department = sc.next();


        switch(empID){
            case 1:
                System.out.println("Abby");
                break;
            case 2:
                System.out.println("BOB");
                break;
            case 3:
                System.out.println("Charley");
                switch(department){
                    case "Management":
                        System.out.println("Management");
                        break;
                    case "IT":
                        System.out.println("IT");
                        break;
                    default:
                        System.out.println("invalid");
                }

        }
    }
}
