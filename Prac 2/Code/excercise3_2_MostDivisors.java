public class excercise3_2_MostDivisors {

   public static void main(String[] args) {
       int maxDivisors = 1;  // Maximum number of divisors seen so far.
       int numberWithMax = 1;   // A value of N that had the given number of divisors.

       for (int N = 2; N <= 10000; N++) {
           int divisorCount = countDivisors(N);
           if (divisorCount > maxDivisors) {
               maxDivisors = divisorCount;
               numberWithMax = N;
           }
       }

       System.out.println("Among integers between 1 and 10000,");
       System.out.println("The maximum number of divisors is " + maxDivisors);
       System.out.println("A number with " + maxDivisors + " divisors is " + numberWithMax);
   }

   public static int countDivisors(int number) {
       int count = 0;
       int sqrt = (int) Math.sqrt(number);

       for (int i = 1; i <= sqrt; i++) {
           if (number % i == 0) {
               count += 2; // Increment count for both i and number/i
           }
       }

       // If number is a perfect square, decrement count by 1
       if (sqrt * sqrt == number) {
           count--;
       }

       return count;
   }

}
