import java.util.*;
import java.util.stream.Collectors;

public class PrintEmployeeNamesInAlphabeticalOrderByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 4000),
                new Employee("Bob", "HR", 3500),
                new Employee("Charlie", "IT", 6000),
                new Employee("Charlie1", "IT", 6000),
                new Employee("David", "IT", 7000),
                new Employee("Anu", "Finance", 5000),
                new Employee("Archie", "Finance", 5000)
        );

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.collectingAndThen(Collectors.toList(),
                                        employee -> {
                                            employee.sort(Comparator.naturalOrder());
                                            return employee;
                                        }
                                )
                        )
                )).forEach((key,value)->System.out.println(key+" "+ value));




    }
}
