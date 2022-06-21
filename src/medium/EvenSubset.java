package medium;

public class EvenSubset {
    public static void main(String[] args) {
        int n = 18;
        int m = 32;
        System.out.println(isEvenSubset(m,n));
    }

    static int isEvenSubset(int m, int n) {
        int result = 0;
        for(int i = 2; i < m; i++) {
            if(m % i == 0 && i % 2 == 0) {
                for(int j = 2; j < n; j++) {
                    if(n % j == 0) {
                        if(i == j) {
                            result = 1;
                        } else {
                            result = 0;
                        }
                    }
                }
            }
        }
        return result;
    }
}
