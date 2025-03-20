import java.util.Arrays;
import java.util.List;

public class SumNums {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
//        int num = nums.stream().reduce((integer, integer2) -> integer+integer2).get();
//        int num = nums.stream().reduce(Integer::sum).get();
        int num = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(num);
    }
}
