package medium;

public class VanillaArray {
    public static void main(String[] args) {
        int[] a = {22, -2, 22222, 222, 22222222};
        System.out.println(isVanilla(a));
    }

    static int isVanilla(int[] a) {
        int onlyElement = 0;
        if (a.length > 0) {
            int remainder = a[0] % 10;
            onlyElement = remainder;
        }
        int returnIsVanilla = 1;

        int n = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0)
                a[i] = -1 * a[i];

            n = a[i];
            while(n != 0) {
                int remainder = n % 10;

                if(remainder != onlyElement) {
                    returnIsVanilla = 0;
                    break;
                }
                n /= 10;

            }


        }


        return returnIsVanilla;
    }
}
