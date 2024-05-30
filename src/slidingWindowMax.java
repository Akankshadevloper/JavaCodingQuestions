import java.util.Scanner;

    public class slidingWindowMax {

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int [] arr = new int[scn.nextInt()];

            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = scn.nextInt();
            }

            int windowSize = scn.nextInt();

            solve(arr, windowSize);

        }

        public static void solve(int[] arr, int k)
        {
            // starting the outer loop from k and running it until,
            // current pointer is EQUAL to arr.length
            for(int i = k; i <= arr.length; i++)
            {
                int max = Integer.MIN_VALUE;

                // this loop considers subarrays of size k ending at i-1
                for(int j = i-k; j<i; j++)
                {
                    max = Math.max(max, arr[j]);
                }

                System.out.println(max);
            }
        }
    }
