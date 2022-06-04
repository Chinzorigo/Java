package medium;

import java.util.Arrays;

public class clusterCompression {
    public static void main(String[] args) {
        int[] a = {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};
        System.out.println(Arrays.toString(isClusterCompression(a)));
    }

    static int[] isClusterCompression(int[] a) {
        int countCluster = 0;
        for(int i = 0; i < a.length; i++) {
            if(i == 0) {
                countCluster = 1;
            } else if (a[i] != a[i-1]){
                countCluster++;
            }
        }
        int[] returnArray = new int[countCluster];
        int k =0;
        for(int j = 0; j < a.length; j++) {
            if(j == 0) {
                returnArray[k] = a[j];
                k = 1;
            } else if(a[j] != a[j-1]) {
                returnArray[k] = a[j];
                k++;
            }
        }


        //int[] result = new int[];

        return returnArray;
    }
}
