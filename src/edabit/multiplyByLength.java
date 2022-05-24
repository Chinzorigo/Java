package edabit;
import java.util.Arrays;
public class multiplyByLength {
    public static void main(String[] args) {
        int[] arr = {2,6,4,9};
        System.out.println(Arrays.toString(multiplyByLength(arr)));

    }

    public static int[] multiplyByLength (int[] arr) {
        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] *= arr.length;
        }
        return arr;
    }
}
