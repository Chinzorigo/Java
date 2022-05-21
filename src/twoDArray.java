public class twoDArray {
    public static void main(String[] args) {
        int ages[][] = {
                {12, 24, 18, 40},
                {35, 23},
                {31},
                {23, 45, 19}
        };
/*
        for (int[] innerArray: ages) {

            for(int data: innerArray) {
                System.out.println(data);
            }
        }

 */
        for(int i = 0; i < ages.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < ages[i].length; j++) {
                System.out.println(ages[i][j]);
            }
        }

    }
}
