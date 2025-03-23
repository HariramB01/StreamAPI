import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListIntoTwo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        Map<Boolean,List<Integer>> result = nums.stream()
                .collect(Collectors.partitioningBy(n->n>50));

        System.out.println(result.toString());
    }
}
