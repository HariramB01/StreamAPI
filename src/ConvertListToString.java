import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertListToString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I", "am", "hariram", "working", "as", "a", "java", "developer");
//        Collector<String, ?, String> custom = Collectors.reducing("",(s1,s2)->s1+"-"+s2);
//        String result = list.stream().collect(Collectors.joining("-"));
        String result = String.join("-", list);
        System.out.println(result);
    }
}
