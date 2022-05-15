public class array {
    public static void main(String[] args) {

        String[] names = {"Ben", "Kim", "Amy", "Joe", "Sam"};
        int[] ages = {37,19,21,15,45};

//        for (int idx =0; idx <= 4; idx++) {
//            System.out.println("Hello " + names[idx]);
//        }

        for ( int idx = 0; idx <=4; idx++) {
            if (ages[idx] >= 21 ) {
                System.out.println("You are old enough to enter.");
                System.out.println("Welcome to the club " + names[idx]);
            }
        }
    }
}
