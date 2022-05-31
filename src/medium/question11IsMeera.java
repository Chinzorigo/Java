package medium;

public class question11IsMeera {
    public static void main(String[] args) {
        int[] arr = {9,10,0,1};
        System.out.println(isMeera(arr));
    }

    static int isMeera(int[] arr) {
        boolean ones = false,
                nine = false;
        for(int idx = 0; idx < arr.length; idx++ ) {
            if(arr[idx] == 1) {
                ones = true;
            } else if (arr[idx] == 9) {
                nine = true;
            }
        }
        if(ones == true && nine == true){
            return 1;
        }
        return 0;

    }
}
