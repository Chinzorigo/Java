package basic;

import java.util.ArrayList;

public class AList01 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        for(String language: languages) {
            System.out.print(language);
            System.out.print(" ");
        }
    }
}
