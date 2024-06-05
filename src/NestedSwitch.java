import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID){
            case 1:
                System.out.println("Akanksha Kumari");
                break;
            case 2:
                System.out.println("Bibek Behera");
                break;
            case 3:
                System.out.println("Emp Number 3 ");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Computer Science ":
                        System.out.println("Computer Department");
                        break;
                    default:
                        System.out.println("No department found ");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
        }
    }
}
