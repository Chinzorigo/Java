package medium;

public class NormalNumber {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(isNormal(a));
    }

    static int isNormal(int a) {
        for(int i = 2; i < a; i++) {
            if(a % i == 0 && i % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
