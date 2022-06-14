package medium;

public class LastEvenIndex {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 9, 7};
        System.out.println(lastEven(a));
    }

    static int lastEven(int[] a) {
        int evenIndex = -1;
        for(int i = a.length-1; i >= 0; i--) {
            if(a[i] % 2 == 0) {
                evenIndex = i;
                break;
            }

        }
        return evenIndex;
    }
}
