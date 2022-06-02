package medium;

public class test {
    public static void main(String[] args) {
        int[] a = {6,8,1,9,6,8,6,9,9};
        System.out.println(answerTwo(a));
    }

    static int answerTwo(int[] a) {
        int maxFreq = 0;
        int ans = -1;

        for(int i = 0; i < a.length-1; i++) {
            int currentFreq = 1;

            for(int j = i+1; j < a.length-1; j++) {
                if(a[i] == a[j]) {
                    ans = a[i];
                    currentFreq++;
                }
            }

            if(maxFreq < currentFreq) {
                maxFreq = currentFreq;
                ans = a[i];
            } else if (maxFreq == currentFreq){
                ans = Math.min(ans,a[i]);
            }
        }
        return ans;

    }

}