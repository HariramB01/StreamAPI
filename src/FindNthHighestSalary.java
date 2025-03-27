import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindNthHighestSalary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        int n = 1;
        Integer result = list.stream()
                .sorted()
                .skip(n-1)
                .findFirst()
                        .orElseThrow();
        System.out.println(result);

    }
}
