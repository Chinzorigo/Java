package medium;

public class BunkerArrayV2 {
    public static void main(String[] args) {
        int[] a = {7, 6, 10, 1};
        System.out.println(isBunker(a));
    }
    static int isBunker(int[] a) {
        int one = 0;
        int prime = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                one++;
            }
            if(isPrime(a[i]) == 1) {
                prime++;
            }

        }
        if(one > 0 && prime > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int isPrime(int a) {
        int isPrime = 1;
        //condition for non-prime number
        if(a <= 1) {
            isPrime = 0;
            return isPrime;
        }
        for (int idx = 2; idx <= a / 2; idx++) {
            if (a % idx == 0) {
                isPrime = 0;
                break;
            }


        }

        return isPrime;
    }
}
