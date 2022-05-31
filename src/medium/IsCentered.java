package medium;

public class IsCentered {
    public static void main(String[] args) {
        ;
        System.out.println(centeredArray( new int[]{3,2,1,4,1}));
    }

    public static int centeredArray(int[] arr) {
        if (arr.length == 0 || arr.length % 2 == 0)
            return 0;
        int midIndex = arr.length / 2;
        int middleItem = arr[midIndex];
        for (int i = 0; i < arr.length; i++) {
            if (i != midIndex && middleItem >= arr[i])
                return 0;
        }
        return 1;
    }
}
