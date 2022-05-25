package edabit;

public class minimumRemovalsToMakeSumEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(minimumRemovals(arr));
    }

    public static int minimumRemovals(int[] arr) {
        int sum = 0;
        for(int a:arr) sum +=  a;
        return sum % 2 == 0 ? 0 : 1;
/*
        int sumOfArray = 0;
        for(int idx: arr) {
            sumOfArray += idx;
        }

        if(sumOfArray % 2 == 0) return 0;

        return 1;

 */
    }
}
