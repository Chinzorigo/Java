package medium;

public class FilterArray_9_7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 6, 11, 4, 7, 13};
        System.out.println(isFilterArray(a));
    }
    static int isFilterArray(int[] a) {
        int isFilter = 1;

        for (int i: a) {
            for(int j: a) {
                if(i == 9) {
                    if(j == 11) {
                        isFilter = 1;
                    } else {
                        isFilter = 0;
                    }
                }
                if(i == 7) {
                    if(j != 13) {
                        isFilter = 1;
                    } else {
                        isFilter = 0;
                    }
                }

            }
        }

        return isFilter;
    }
}
