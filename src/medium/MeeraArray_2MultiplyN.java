package medium;

public class MeeraArray_2MultiplyN {
    public static void main(String[] args) {
        int[] a = {8, 3, -1, 17 , 18, -2};
        System.out.println(isMeeraArray(a));
    }
    static int isMeeraArray(int[] a) {
        int isMeera = 1;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i] * 2 == a[j]) {
                    isMeera = 0;
                    break;

                }
            }
            if (isMeera == 0) break;
        }
        return isMeera;
    }
}
