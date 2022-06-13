package medium;

import java.util.ArrayList;


public class WaveArray {
    public static void main(String[] args) {
        int[] a = {7, 2, 9, 10, 5};
        System.out.println(isWaveArray(a));
    }

     static int isWaveArray(int[] a) {
        int isWave = 1;
        if(a.length == 0) return 0;
        for(int i = 0; i < a.length-1; i++) {
            if(a[i] % 2 == 0) {
                if(a[i+1] % 2 == 0){
                    isWave = 0;
                    break;
                }
            }
            else {
                if(a[i+1] % 2 !=0){
                    isWave = 0;
                    break;
                }
            }
        }
        return isWave;
    }
}

// array a
// oddIndex = 1
// evenIndex = 0
// for loop (a)
//