import java.util.Scanner;

public class LargestNumberUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int largestNumber = Integer.MIN_VALUE;

        while(true){
            System.out.print("Enter a number(0  to stop) : ");
            n = sc.nextInt();


            if(n == 0){
                break;
            }

            if(n>largestNumber){
                largestNumber = n;
            }
        }

        if(largestNumber == Integer.MIN_VALUE){
            System.out.println("No number were entered ");
        }else{
            System.out.println("The largest number entered is: " + largestNumber);
        }

        sc.close();
    }
}
