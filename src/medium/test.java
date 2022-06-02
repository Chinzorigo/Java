package medium;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int[] a =  {3,3, 1,4,4,-1};
        System.out.println(f(a));
    }

    static int f(int[] a) {
        int sumOfOdd =0, sumOfEven = 0;

        for(int idx: a) {
            if (idx % 2 == 0) {
                sumOfEven = idx;
                System.out.println("Even: " + idx);
            } else {
                sumOfOdd += idx;
                System.out.println("Odd: " + idx);
            }
        }
        return sumOfOdd - sumOfEven;
    }

}