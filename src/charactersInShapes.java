public class charactersInShapes {
    public static void main(String[] args) {
        String[] arr = {
                "###",
                "###",
                "###"

        };

        System.out.println(countCharacters(arr));
    }

    public static int countCharacters(String[] arr) {
        if (arr == null) {
            return 0;
        } else {
            int sum = 0;
            for (String s : arr) {
                sum += s.length();
            }
            return sum;
        }
    }
}
