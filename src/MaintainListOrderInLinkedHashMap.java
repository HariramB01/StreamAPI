import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaintainListOrderInLinkedHashMap {

    public static void main(String[] args) {
//        In hashMap we cannot maintain the order
//        But using LinkedHashMap we can maintain the order
//        we are going to perform now such operation only


        List<People> people = Arrays.asList(
                new People(1,"Hariram","male"),
                new People(2,"Hari","male"),
                new People(3,"Harish","male"),
                new People(1,"Harirams","male"),
                new People(2,"Haris","male"),
                new People(3,"Harishs","male"),
                new People(4,"Harini","female")
        );

        List<String> list = List.of("Alice", "Bob", "Charlie", "David", "Eve");


        Map<String, Integer> orderedMap = list.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (e1, e2) -> e1,
                        LinkedHashMap::new)
                );

        orderedMap.forEach((key,value)->System.out.println("Name: "+key+" length: "+value));

        Map<Integer, People> peopleMap = people.stream()
                .collect(Collectors.toMap(
                        People::getId,
                        Function.identity(),
                        (existing, replacement) -> existing, // merge function (in case of duplicate keys)
                        LinkedHashMap::new
                ));

        peopleMap.forEach((id, person) -> System.out.println(id + " => " + person));

    }
}
