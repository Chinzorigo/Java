package edabit;

public class findTheSmallestNumberInAnArray {
    public static void main(String[] args) {
        int[] arg = {34, 15, 88, 2};
        System.out.println(findSmallestInt(arg));
    }

    public static int findSmallestInt(int[] arg) {
        for(int idx = 0; idx < arg.length; idx++) {
            for(int jdx = idx + 1; jdx < arg.length; jdx++) {
                int temp;
                if(arg[jdx] <= arg[idx]) {
                    temp = arg[idx];
                    arg[idx] = arg[jdx];
                    arg[jdx] = temp;
                }


            }

        }

        return arg[0];
    }
}
