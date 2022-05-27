package MIU;

public class Question13 {
    public static void main(String[] args) {
        System.out.println(answerOne(6));
    }

    static int answerOne(int n) {
        for (int idx = 1; idx <= n; idx++){
            for(int jdx = 1; jdx <= n; jdx++ ) {
                if(n == Math.pow(idx,2) + Math.pow(jdx,2)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
