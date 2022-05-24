package edabit;
import java.util.Arrays;
public class returnTheFirstAndLastElementsInAnArray {
    public static void main(String[] args) {
        String[] arr = {"undefined", "6", "hello", "null"};

        System.out.println(Arrays.toString(firstLast(arr)));
    }

    public static String[] firstLast(String[] arr) {
        String[] temp = new String[] {arr[0],arr[arr.length-1]};
        //temp[0] = arr[0];
        //temp[1] = arr[arr.length-1];

        return temp;
    }
}
