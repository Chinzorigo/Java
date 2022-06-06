package medium;

public class IsGetExponent {
    public static void main(String[] args) {
        System.out.println(getExponent(162,3));
//        System.out.println(getExponent(27,3));
//        System.out.println(getExponent(28,3));
//        System.out.println(getExponent(280,7));
//        System.out.println(getExponent(-250,5));
//        System.out.println(getExponent(18,1));
//        System.out.println(getExponent(128,4));
    }

    static int getExponent(int n, int p) {

        if(p <=1) {
            return -1;
        }
        int x =0;
        for (;n % p == 0; n /= p) {
            x++;
        }
        return x;
    }
}
