import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> oddNums = nums.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(oddNums.toString());
    }
}
