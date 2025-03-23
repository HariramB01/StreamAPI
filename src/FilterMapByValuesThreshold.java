import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterMapByValuesThreshold {
    public static void main(String[] args) {
        List<Candidate> list = Arrays.asList(
                new Candidate(1,11,"Hariram"),
                new Candidate(2,17,"Harish"),
                new Candidate(3,20,"Hari"),
                new Candidate(4,21,"Harii")
        );

        list.stream()
                .filter(c->c.getAge()>18)
                .forEach(System.out::println);


        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Apple", 10);
        dataMap.put("Banana", 5);
        dataMap.put("Orange", 7);
        dataMap.put("Mango", 12);
        dataMap.put("Grapes", 4);
        System.out.println("Step 1 sort by key ascending");
        //sort by key (ascending)
        dataMap.entrySet().stream()
                .filter(e->e.getValue()<6)
                .sorted(Map.Entry.comparingByKey())
                .forEach(e->System.out.println("Key: "+e.getKey()+" Value: "+e.getValue()));


        //Sort by Value (ascending)
        System.out.println("Step 2 sort by value ascending");
        dataMap.entrySet().stream()
                .filter(e->e.getValue()>6)
                .sorted(Map.Entry.comparingByValue())
                .forEach(e->System.out.println("Key: "+e.getKey()+" Value: "+e.getValue()));


        //Sort by value (descending)
        System.out.println("Step 3 sort by value descending");
        dataMap.entrySet().stream()
                .filter(e->e.getValue()>6)
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEach(e->System.out.println("Key: "+e.getKey()+" Value: "+e.getValue()));



    }
}
