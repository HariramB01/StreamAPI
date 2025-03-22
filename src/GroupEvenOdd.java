import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90,30,1357);
        Map<Boolean,List<Integer>> result = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(result);
    }
}
