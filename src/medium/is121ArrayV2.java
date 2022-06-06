package medium;

public class is121ArrayV2 {
    public static void main(String[] args) {
        System.out.println(is121Arrays(new int[] {1, 1, 1, 1, 2, 2, 2, 1, 1, 1}));
    }
    static int is121Arrays(int[] a) {
        int is121 = 1;
        int fristonecount = 0, secondonecount = 0, twocount = 0;
        int prevelement = 0;
        int changecount = 0;
        int firstelement = a[0];
        if (firstelement != 1) is121 = 0;
        for (int i = 0; i < a.length && is121 == 1; i++)
        {

            if (a[i] == 2)
                twocount++;

            if (prevelement != a[i])
                changecount++;

            if (changecount == 1)
                if (a[i] == 1)
                    fristonecount++;
            if (changecount == 3)
                if (a[i] == 1)
                    secondonecount++;
            if (changecount > 3)
                is121 = 0;

            prevelement = a[i];
        }
        if (twocount < 1)
            is121 = 0;
        if (fristonecount != secondonecount)
            is121 = 0;
        return is121;
    }
}
