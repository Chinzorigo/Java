package medium;

public class MeeraArray_2MultiplyN {
    public static void main(String[] args) {
        int[] a = {8, 3, -1, 17 , 18, -2};
        System.out.println(isMeeraArray(a));
    }
    static int isMeeraArray(int[] a) {
        int isMeera = 1;
        for (int k : a) {
            for (int i : a) {
                if (k * 2 == i) {
                    isMeera = 0;
                    break;

                }
            }
            if (isMeera == 0) break;
        }
        return isMeera;
    }
}
