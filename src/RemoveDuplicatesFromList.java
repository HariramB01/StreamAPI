import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 4000),
                new Employee("Bob", "HR", 3500),
                new Employee("Charlie", "IT", 6000),
                new Employee("Charlie1", "IT", 6000),
                new Employee("David", "IT", 7000),
                new Employee("Eve", "Finance", 5000),
                new Employee("Eve1", "Finance", 5000)
        );

        employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getDepartment))),
                        ArrayList::new
                )).forEach(System.out::println);



    }
}
