package medium;

public class OddSpaced {
    public static void main(String[] args) {
        //int[] a = {100, 19, 131, 140};
        //int[] a = {100, 19, -131, -140};
        //int[] a = {80, -56, 11, -81};
        int[] a = {};
        System.out.println(isOddSpaced(a));
    }

    static int isOddSpaced(int[] a) {
        int min = 0;
        int max = 0;
        int count = 0;
        for(int i: a) {
            if(count == 0){
                min = i;
                max = i;
                count++;
            }
            if(max < i){
                max = i;
            }
            if(min > i) {
                min = i;
            }
        }
        System.out.println("difference: " + (max - min));


        if((max-min) % 2 == 1 && a.length >= 2){
            return 1;
        } else {
            return 0;
        }
    }
}
