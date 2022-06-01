package edabit;

public class Question5_returnCommonArray {
    public static void main(String[] args) {
        int[] first = {1,8,3,2};
        int[] second = {4,2,6,1};
        f(first,second);
    }

    static void f(int[] first, int[] second) {
        //int[] returnArray = new int[];
        //int countOfEqual = 0;
        for(int idx = 0; idx < first.length; idx++) {
            for (int jdx = 0; jdx < second.length; jdx++) {
                if (first[idx] == second[jdx]); {
                    System.out.println(first[idx]);
                }

            }
        }

    }
}
