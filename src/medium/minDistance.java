package medium;

public class minDistance {
    public static void main(String[] args) {
        int n = 1001;
        System.out.println(isMinDistance(n));
    }
    static int isMinDistance(int n) {
        int distance = 0;
        int minDifference = n;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                for(int j = 1; j <= n; j++) {
                    if(n % j == 0){
                        if(i > j) {
                            distance = i - j;
                            if(distance < minDifference) {
                                minDifference = distance;
                            }
                        }
                    }
                }
            }
        }
        return minDifference;
    }
}
