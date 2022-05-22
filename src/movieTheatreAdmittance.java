public class movieTheatreAdmittance {
    public static void main(String[] arg) {
        boolean isSupervised = false;
        int age = 15;

        System.out.println(acceptIntoMovie(age, isSupervised));
    }

    public static boolean acceptIntoMovie(int age, boolean isSupervised) {
        return age >=15 || isSupervised == true;


/*        if(age >= 15 || isSupervised == true) {
            return true;
        }
        return false;

 */
    }




}
