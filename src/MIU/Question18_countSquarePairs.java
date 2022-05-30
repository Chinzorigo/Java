package MIU;

public class Question18_countSquarePairs {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[] {9,0,2,-5,7, 14, 2}));
        //System.out.println(isPerfectSquare(9));
    }

    static int countSquarePairs(int[] a) {
        int counter = 0;
        if(a.length < 2) return 0;

        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++) {
                if (i!=j){
                    if(a[i]==a[j]){
                        return 0;
                    }
                    if(a[i] < a[j] && a[i] > 0 && a[j] > 0 ){
                        if(isPerfectSquare(a[i]+a[j]) == 1) {
                            System.out.println("ai"+a[i]);
                            System.out.println("aj"+a[j]);
                            counter++;
                        }
                    }


                    }
            }
        }
        return counter;
    }

    static int isPerfectSquare(int a) {
        for(int i = 1; i*i <= a; i++ ) {
            if (a % i == 0 && i * i == a) {
                return 1;
            }
        }
        return 0;
    }
}
