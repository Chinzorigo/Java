package medium;

public class BunkerNumber {
    public static void main(String[] args) {
//        System.out.println(isBunker(11));
//        System.out.println(isBunker(22));
        System.out.println(isBunker(8));
    }

    static int isBunker(int n) {
        int firsBunker = 0;
        int secondBunker = 1;
        int nearestBunker = 0;
        int count = 0;
        while (nearestBunker < n) {

            nearestBunker = firsBunker + secondBunker;
            firsBunker = count;
            secondBunker = nearestBunker;
            count++;
        }

        if (nearestBunker == n) {
            return 1;
        } else {
            return 0;
        }
    }

}
