package chu.edu.exercises;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class MyInteger
 * @since 24.03.2021 - 20.37
 **/
public class MyInteger {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                //is not prime
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The number 1001 is prime, it is - " + isPrime(1001));
        System.out.println("The number 101 is prime, it is - " + isPrime(101));
        System.out.println("The number 33 is prime, it is - " + isPrime(33));
        System.out.println("The number 29 is prime, it is - " + isPrime(29));
        System.out.println("The number 7 is prime, it is - " + isPrime(7));

    }
}
