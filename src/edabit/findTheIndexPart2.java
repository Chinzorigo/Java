package edabit;

public class findTheIndexPart2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int item = 3;
        System.out.println(search(arr, item));
    }
    public static int search(int[] arr, int item) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == item) {
                return idx;
            }
        }
        return -1;
    }
}
