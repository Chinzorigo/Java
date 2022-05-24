package edabit;

public class findTheIndexPart1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int item = 5;

        System.out.println(search(arr, item));
    }

    public static int search(int[] arr, int item) {

        for(int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == item) {
                return idx;
            }

        }
        return -1;
    }
}
