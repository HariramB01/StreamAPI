import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoLists {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> nums1 = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> concatenation = Stream.concat(nums.stream(), nums1.stream()).collect(Collectors.toList());
        System.out.println(concatenation.toString());
    }
}
