package medium;

public class Question14_OccuringNumber {
    public static void main(String[] args) {
        int[] a = {6,8,1,8,6};
        System.out.println(answerTwo(a));
    }

    static int answerTwo(int[] a) {
        int max_freq = 0;
        int ans = -1;
        for (int i = 0; i < a.length-1; i++)
        {
            int curr_freq = 1;
            for (int j = i+1; j < a.length-1; j++) {
                if (a[j] == a[i]) {
                    curr_freq = curr_freq + 1;
                }
            }



            if (max_freq < curr_freq)
            {
                max_freq = curr_freq;
                ans = a[i];
            }
            else if (max_freq == curr_freq)
                ans = Math.min(ans, a[i]);
        }
        return ans;
    }
}
