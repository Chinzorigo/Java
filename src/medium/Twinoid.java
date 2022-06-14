package medium;

public class Twinoid {
    public static void main(String[] args) {
        int[] a = {3, 7, 3, 5, 8, 2};
        System.out.println(isTwinoid(a));
    }

    static int isTwinoid(int[] a) {
        int countTwinoid = 0;
        int countEvenNumbers = 0;
        for(int i = 0; i < a.length-1; i++) {
            if(a[i] % 2 == 0) {
                countEvenNumbers++;
                if(i == a.length-2) {
                    if(a[a.length-1] % 2 == 0) {
                        countEvenNumbers++;
                    }
                }
            }
            if(a[i] % 2 == 0 && a[i+1] % 2 == 0) {
                countTwinoid++;
            }
        }
        System.out.println("countTwinoid: " + countTwinoid);
        System.out.println("countEvenNumbers: " + countEvenNumbers);
        System.out.println("a - length: " + a.length);
        if(countTwinoid == 1 && countEvenNumbers == 2) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
