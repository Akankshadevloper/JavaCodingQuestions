import java.util.Scanner;

public class Random {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for(int num =0; num <=n; num++){
//            System.out.println(num+" ");
//        }

        //while loop

//        int num = 1;
//        while(num<=10099){
//            System.out.println(num);
//            num++;
//        }


        //do while
        int num =1;
        do{
            System.out.println(num);
            num++;
        }while(num<=5);
    }
}
