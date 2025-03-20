import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90,10,89,30,53,123,2351);
        Map<Integer, Long> map = nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map.toString());
    }
}
