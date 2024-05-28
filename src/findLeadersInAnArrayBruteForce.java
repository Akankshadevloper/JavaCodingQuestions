public class findLeadersInAnArrayBruteForce{
public static void findLeadersInAnArrayBruteForce(int arr[])
{
    System.out.println("Finding leaders in an array using brute force : ");
    for (int i = 0; i < arr.length; i++) {
        boolean isLeader=true;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i] <= arr[j])
            {
                isLeader=false;
                break;
            }
        }
        if(isLeader)
            System.out.print(arr[i]+" ");
    }
}
}