package edabit;

public class theForbiddenLetter {
    public static void main(String[] args) {
        String[] words = {"deep", "loves", "each"};
        String ch = "deep";

        System.out.println(forbiddenLetter(ch, words));
    }

    public static boolean forbiddenLetter(String ch, String[] words) {

            for (int idx = 0; idx < words.length; idx++) {
                if (words[idx].contains(ch)) {
                    return false;
                }

                }
                return true;


        }

}
