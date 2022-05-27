package MIU;

public class test {
    public static void main(String[] args) {
        int[] a = {1};
        isBean(a);
    }

    static void isBean(int[] a) {
        for(int idx = 0; idx < a.length; idx++){
            for(int jdx = 1; jdx < a.length; jdx++){
                System.out.println(a[idx]);
            }
        }
        System.out.println("End");
    }
}