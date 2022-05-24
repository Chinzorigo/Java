package edabit;

public class HelloWorld {
    public static void main (String[] args) {
    int number = 372;
    boolean isPrime = true;
    //int test = 2;

    for ( int test = 2; test < number; test++ ) {
        if (number % test == 0) {
            isPrime = false;
            System.out.println(number + " is divisible by " + test);
        }

    }

    if (isPrime) {
        System.out.println("This is a prime number!");
    }
    else {
        System.out.println("This is not a prime number!");
    }
    }
}

