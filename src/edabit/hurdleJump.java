package edabit;

public class hurdleJump {
    public static void main(String[] args) {
        int[] hurdles = {5, 5, 3, 4, 5};
        int h = 3;

        System.out.println(hurdleJump(hurdles, h));

    }

    public static boolean hurdleJump(int[] hurdles, int h) {
        if (hurdles.length == 0) {
            return true;

        }
        for (int i = 0; i < hurdles.length; i++) {
            if (h > hurdles[i]) {
                return true;
            }

        }
            return false;

    }


}
