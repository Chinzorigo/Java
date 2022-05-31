package medium;

public class question16IsMadhavArray {
    public static void main(String[] args) {
        System.out.print(isMadhavArray(new int[] {3, 1, 2, 3, 0}));
    }

    static int isMadhavArray(int[] a) {
        int isMadhav = 1;
        if(a.length <3) return 0;
        // check if The length of a Madhav array must be n*(n+1)/2 for some n.
        int isLengthisMadhav = 0;
        for(int i = 1; i <= a.length && isLengthisMadhav == 0; i++) {
            if(a.length == i * (i-1) / 2) {
                isLengthisMadhav = 1;
            }
        }

        if(isLengthisMadhav == 0) return 0; //the length not satisfy the condition

        int startIndex = 1, round = 1;
        int firstValue = a[0];
        int endIndex = startIndex + round;
        while (isMadhav == 1 && endIndex <= a.length) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += a[i];
            }
            if(firstValue != sum)
                isMadhav =0;
            round++;
            startIndex = endIndex + 1;
            endIndex = startIndex + round;
        }
        return isMadhav;
    }
}
