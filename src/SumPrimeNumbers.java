import java.util.Arrays;
import java.util.List;

public class SumPrimeNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int result = nums.stream()
                .filter(SumPrimeNumbers::isPrime)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println(result);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int n = (int) Math.sqrt(num);
        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
