package edabit;

public class ConcatenateFirstAndLastNameIntoOneString {
    public static void main(String[] args) {
        String firstName = "Chinzorig";
        String lastName = "Otgonjargal";
        System.out.println(concatName(firstName,lastName));
    }
    public static String concatName(String firstName, String lastName) {
        //return lastName + ", " + firstName;
        return String.format("%s, %s", lastName, firstName);
    }
}
