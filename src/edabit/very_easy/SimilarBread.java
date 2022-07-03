package edabit.very_easy;

public class SimilarBread {
    public static void main(String[] args) {
        System.out.println(Sandwitches(new String[]{"white bread", "lettuce", "white bread"},
                new String[]{"white bread", "tomato", "white bread"}));
    }

    static boolean Sandwitches(String[] a, String[] b) {
        if(a[0] == b[0] && a[2] == b[2]) {
            return true;
        } else {
            return false;
        }
    }
}
