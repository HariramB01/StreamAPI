import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortUsingCustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hari","I","am","hello","Java", "developer", "How", "are", "you","uh");
        list.stream()
                .sorted((a,b)->a.length()-b.length()).forEach(System.out::println);

        System.out.println("=============");

        //find Top 3 max Elements
        list.stream()
                .sorted((a,b)->a.length()-b.length())
                .skip(list.size()-3)
                .forEach(System.out::println);


        System.out.println("=============");

        list.stream()
                .sorted((a,b)->b.length()-a.length())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Concatenation");

        Collector<String,?,String> custom = Collectors.reducing("", (s1,s2)->s1+"-"+s2);
        String result = list.stream().collect(custom);
        System.out.println(result);

        System.out.println("Collectors.Joining");

        String result1 = list.stream().collect(Collectors.joining("-"));
        System.out.println(result1);

        System.out.println("string.join");
        String result2 = String.join("-", list);
        System.out.println(result2);



    }
}
