import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Take input from the user till the user does not press x or X
        int ans = 0;
        while (true){
            System.out.print("Enter the operator:  ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enter the two numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();


                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                    }
                }else if (op == 'x'|| op== 'X' ){
                break;
            }else{
                System.out.println("Error");
            }
            System.out.println(ans);
        }

    }
}
