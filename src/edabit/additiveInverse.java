package edabit;
import java.util.Arrays;
public class additiveInverse {
    public static void main(String[] args) {
        int[] arr = {5, -7, 8, 3};
        System.out.println(Arrays.toString(additiveInverse(arr)));
    }

    public static int[] additiveInverse(int[] arr) {
        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = -arr[idx];
        }
        return arr;
    }
}
