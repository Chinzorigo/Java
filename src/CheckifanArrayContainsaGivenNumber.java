public class CheckifanArrayContainsaGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1 , 25};
        int el = 25;
        System.out.println(check(arr, el));
    }


        public static boolean check(int[] arr, int el) {
            for (int a: arr) {
                if(a == el) {
                    return true;
                }
            }
            return false;
        }

}
