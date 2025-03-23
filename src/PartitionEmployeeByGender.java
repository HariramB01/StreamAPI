import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionEmployeeByGender {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People(1,"Hariram","male"),
                new People(2,"Hari","male"),
                new People(3,"Harish","male"),
                new People(4,"Harini","female")
        );

        people.stream()
                .collect(Collectors.groupingBy(
                        People::getGender
                )).entrySet().stream()
                .forEach((e)->System.out.println("Department: "+e.getKey()+" -> People: "+e.getValue()));



    }
}
