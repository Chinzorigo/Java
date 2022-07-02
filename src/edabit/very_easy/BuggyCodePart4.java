package edabit.very_easy;

public class BuggyCodePart4 {
    public static void main(String[] args) {
        String name = "Mubashir";

        System.out.println(greeting(name));
    }

    public static String greeting(String name) {
        if(name == "Mubashir") {
            return "Hello, my Love!";
        }
        return "Hello, " + name;
    }
}
