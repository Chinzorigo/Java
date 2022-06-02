package medium;

import java.util.Arrays;

public class Question5_CommonElements {
    public static void main(String[] args) {
        int[] first = {1,2,3,4,5};
        int[] second = {1 ,5};

        System.out.println(Arrays.toString(f(first,second)));
    }

    static int[] f(int[] first, int[] second) {
        if(first == null || second == null) return null;
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

        int min;
        if(first.length < second.length) {
            min = first.length;
        } else {
            min = second.length;
        }
        System.out.println("Min element is: " + min);

        int[] returnArray = new int[equalElement];
        int a = 0;

        for (int i : first) {
            for (int j : second) {
                //System.out.println("");
                if (i == j) {
                    returnArray[a] = i;
                    a++;
                    break;

                }

            }
            //if (a == equalElement) break;
        }

        return returnArray;
    }
}
