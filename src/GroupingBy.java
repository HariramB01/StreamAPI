import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 4000),
                new Employee("Bob", "HR", 3500),
                new Employee("Charlie", "IT", 6000),
                new Employee("Charlie", "IT", 6000),
                new Employee("David", "IT", 7000),
                new Employee("Eve", "Finance", 5000),
                new Employee("Eve", "Finance", 5000)
        );

        System.out.println("Sorting by name");
        List<Employee> result1 = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(result1);
        System.out.println("Sorting by department");
        List<Employee> result2 = employees.stream().sorted(Comparator.comparing(Employee::getDepartment)).collect(Collectors.toList());
        System.out.println(result2);
        System.out.println("descending order");
        List<Employee> result3 = employees.stream().sorted(Employee::compareToReverse).collect(Collectors.toList());
//        System.out.println(result3);
        result3.forEach(System.out::println);
        System.out.println("descending order type 1 ");
        employees.sort(Collections.reverseOrder());
        System.out.println("Ascending order");
        List<Employee> sortAsc = employees.stream().sorted().collect(Collectors.toList());
        System.out.println("descending order type 2 ");
        Collections.sort(employees, Collections.reverseOrder());

    }
}
