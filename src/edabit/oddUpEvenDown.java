package edabit;
import java.util.Arrays;

public class oddUpEvenDown {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(transform(arr)));
    }

    public static int[] transform(int[] arr) {

        for( int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] % 2 == 0 ) {
                arr[idx]--;
            }
            else {
                arr[idx]++;
            }
        }
        return arr;
    }
}
