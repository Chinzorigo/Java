package medium;

import java.util.Arrays;

public class Question5_CommonElements {
    public static void main(String[] args) {
        int[] first = {1,8,3,2};
        int[] second = {4,6,1, 1,2, 2, 3, 3 , 1 };

        System.out.println(Arrays.toString(f(first,second)));
    }

    static int[] f(int[] first, int[] second) {
        int equalElement = 0;

        for (int idx: first) {
            for (int jdx: second) {
                if(idx == jdx) {
                    equalElement++;
                    break;
                }
            }
        }
        System.out.println("EqualElement: " + equalElement);

        int[] returnArray = new int[equalElement];
        int i = 0;
        while (i < returnArray.length) {
            for (int idx = 0; idx < first.length; idx++) {
                for (int jdx = 0; jdx < second.length; jdx++) {
                    if(first[idx] == second[jdx]) {
                        returnArray[i] = second[jdx];
                        System.out.println("first: " + first[idx] );
                        System.out.println("second: " + second[jdx] );
                        System.out.println("return: " + returnArray[i] );
                        break;

                    }


                }
            }
            i++;
        }



        return returnArray;
    }
}
