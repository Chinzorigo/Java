package medium;

public class Question21_stantonMeasure {
    public static void main(String[] args) {
        int[] a = {1,3,1,1,3,3,2,3,3,3,4};
        System.out.println(stantonMeasure(a));
    }

    static int stantonMeasure(int[] a) {
        int stanton = 0;
        int occurrencesOfOne = 0;
        for(int i = 0; i < a.length-1; i ++) {
            if(a[i] == 1) {
                    occurrencesOfOne++;
            }
        }
        for(int jdx: a) {
            if(jdx == occurrencesOfOne) {
                stanton++;
            }
        }

        return stanton;
    }
}
