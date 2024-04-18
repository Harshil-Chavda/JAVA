class PrimeNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of prime numbers to generate
        generatePrimes(n);
    }

    public static void generatePrimes(int n) {
        int count = 0;
        int num = 2; // Starting from 2, the first prime number

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
