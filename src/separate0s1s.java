public class separate0s1s {
    public static int[] separate0s1sSolution2(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            int left=0;
            int right=arr.length-1;
            while(arr[left]==0)
            {
                left++;
            }
            while(arr[right]==1)
            {
                right--;
            }

            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }
}
