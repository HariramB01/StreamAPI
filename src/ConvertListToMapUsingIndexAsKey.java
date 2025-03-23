import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertListToMapUsingIndexAsKey {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        Map<Integer,Integer> result = IntStream.range(0,nums.size())
                .boxed()
                .collect(Collectors.toMap(i->i, nums::get));

        System.out.println(result);
    }
}
