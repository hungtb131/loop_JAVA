package loopjava;

public class primeNumberFoundber {
    public static void main(String[] args) {

        int i;
        int num = 0;
        int limited_Check = 100;
        boolean isPrime = true;

        //mảng rỗng
        String primeNumbersFound = "";

        //Start loop 1 to limeted_Check
        for (i = 1; i <= limited_Check; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";

            }
        }
        System.out.println("Prime numbers from 1 to " + limited_Check + " are:");
        // Print prime numbers from 1 to limited_check
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }
}
