import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonListBetweenTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        List<Integer> list2 = Arrays.asList(10,89);
        List<Integer> result = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(result);
    }
}
