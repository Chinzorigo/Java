package medium;

public class Question10_isFancy {
    public static void main(String[] args) {
        int a = 60;
        System.out.println(isFancy(a));
    }

    static int isFancy(int a) {
        int i = 1;
        int j = 1;
        while (i < a)
        {
            int temp = j;
            j = 2 * i + 3 * j;
            i = temp;
            if (i == a)
            {
                return 1;
            }
        }
        return 0;
    }



}
