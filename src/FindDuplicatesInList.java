import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,30,53,123,2351,1251,1357,12,11,90,30,1357);
//        List<Integer> result = list.stream().filter(i-> Collections.frequency(list,i)>1).distinct().collect(Collectors.toList());
        Set<Integer> dupe = new HashSet<>();
        List<Integer> result = list.stream().filter(i->!dupe.add(i)).collect(Collectors.toList());
        System.out.println(result);
    }
}
