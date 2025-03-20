import java.util.Arrays;
import java.util.List;

public class CheckAllElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,100,90);
        boolean checkAllElements = nums.stream().allMatch(i->i%2==0);
        System.out.println(checkAllElements);
    }
}
