package edabit.very_easy;
import java.util.*;
public class BuggyCodePart5 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(PrintArray(number));

    }

    public static List PrintArray(int number)
    {
        List array = new ArrayList<>();

        for(int count = 1; count <= number; count++)
        {
            array.add(count);
        }

        return array;
    }
}
