import java.util.*;
import java.util.stream.*;

public class Java12Teeing {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice","HR", 5000),
                new Employee("Bob", "Finance", 7000),
                new Employee("Charlie", "Accounts", 3000)
        );

        String result = employees.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        (min, max) -> {
                            String minStr = min.map(e -> e.getName() + " (" + e.getSalary() + ")").orElse("N/A");
                            String maxStr = max.map(e -> e.getName() + " (" + e.getSalary() + ")").orElse("N/A");
                            return "Min = " + minStr + "  Max = " + maxStr;
                        }
                ));

        System.out.println(result);
    }
}
