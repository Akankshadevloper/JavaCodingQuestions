import java.util.Scanner;

public class NewFile {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter some input: ");
        int rollno = sc.nextInt();
        System.out.println("Your roll number is "+ rollno);

        ///String is not a primitive
//        System.out.println(sc.nextLine());
    }
}
