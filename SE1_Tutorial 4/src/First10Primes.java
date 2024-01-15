public class First10Primes {
//    public static boolean isPrime(int prime) {
//        if (prime < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(prime); i++) {
//            if (prime % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        int[] primes = new int[10];
//        int count = 0;
//        int prime = 2;
//        while (count < 10) {
//            if (isPrime(prime)) {
//                primes[count] = prime;
//                count++;
//            }
//            prime++;
//        }
//        for (int i : primes) {
//            System.out.println(primes[i] + " ");
//        }
//    }
    public static void main(String[] args) {
        int count = 0; // Count of prime numbers found
        int num = 2;   // Start with the first prime number

        System.out.println("The first 10 prime numbers are: ");

        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
