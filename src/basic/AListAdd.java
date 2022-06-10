package basic;

import java.util.ArrayList;


public class AListAdd {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4};
        System.out.println(isMax(a));
    }

    static ArrayList<Integer> isMax(int[] a) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i: a) {
            if(i % 2 == 0) {
                newArray.add(i);
            }
        }
        return newArray;

    }

}
