package medium;

public class MeeraArray_2MultiplyN {
    public static void main(String[] args) {
        int[] a = {8, 3, 6};
        System.out.println(isMeeraArray(a));
    }
    static int isMeeraArray(int[] a) {
        int isMeera = 1;
        for (int k : a) {
            for (int i : a) {
                if (k == i * 2) {
                    isMeera = 0;
                    break;

                }
            }

        }
        return isMeera;
    }
}
