import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEachNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> squareEachNumber = nums.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squareEachNumber.toString());
    }
}
