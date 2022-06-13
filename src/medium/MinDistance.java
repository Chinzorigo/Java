package medium;

import java.util.ArrayList;

public class MinDistance {
    public static void main(String[] args) {
        System.out.println(isMinDistance(25));
    }
    static int isMinDistance(int a) {
        int minDist = a, count = 0, f1 = 0;
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0)
            {
                if (count == 0)
                    f1 = i;
                count++;
                if (count > 1)
                {
                    if (minDist > i - f1)
                        minDist = i - f1;
                    f1 = i;
                }

            }

            if (count == 1 && i == a - 1)
                minDist = i - i;
        }
        if (count == 0)
        {
            return -1;
        }
        return minDist;
    }
}
