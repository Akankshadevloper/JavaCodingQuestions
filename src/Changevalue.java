import java.lang.reflect.Array;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[]args){
        //create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums ){
        nums[0]=99;
    }
}
