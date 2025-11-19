public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int[] isPrime = new int[N + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = 1;
        }
        int p = 2;
        while (p * p <= N) {
            if (isPrime[p] == 1) {
                for (int i = p * 2; i < isPrime.length; i += p) {
                    isPrime[i] = 0;
                }
            }
            p++;
        }

        int countPrimes = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == 1) {
                countPrimes++;
            }
        }
        int percentage = (int) (((double) countPrimes / N) * 100);
        System.out.println(String.format("There are %d primes between 2 and %d (%d%% are primes))", countPrimes, N,
                percentage));
    }
}