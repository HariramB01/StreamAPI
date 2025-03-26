import java.util.Arrays;
import java.util.List;

public class DistinctAllUnique {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90);
        System.out.println(list.size()==list.stream().distinct().count());
    }
}
