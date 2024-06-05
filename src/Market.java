import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();


        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round");
//                break;
//            case "Grapes":
//                System.out.println("Smalls fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }

//        if(fruit.equals("mango")){
//            System.out.println("king of Mango");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit ");
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round");
            case "Grapes" -> System.out.println("Smalls fruit");
            default -> System.out.println("please enter a valid fruit");


        }
    }
}

