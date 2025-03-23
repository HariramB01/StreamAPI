import java.util.Arrays;
import java.util.List;

public class SumSquareOfAllOddNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,9);
        long result = nums.stream()
                .filter(i->i%2==1)
                .mapToInt(i->i*i)
                .sum();
        System.out.println(result);

    }
}
