package medium;

public class BeanArray {
    public static void main(String[] args) {
        int[] a = {4, 9, 8};
        System.out.println(isBean(a));
    }
    static int isBean(int[] a) {
        int returnBean = 1;
        for (int i : a) {
            int isValid = 0;
            for (int j : a) {
                if (i == j * 2 || i == j * 2 + 1 || i == j / 2) {
                    isValid = 1;
                    break;
                }
            }
            if (isValid == 0) {
                returnBean = 0;
                break;
            }
        }
        return returnBean;
    }
}
