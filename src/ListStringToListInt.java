import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStringToListInt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10","89","30","53","123","2351","1251","1357","12","11","90");
        List<Integer> listStringToListInt = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(listStringToListInt);
    }
}
