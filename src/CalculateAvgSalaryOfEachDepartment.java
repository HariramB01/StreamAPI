import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateAvgSalaryOfEachDepartment {
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

        Map<String, Double> avgSalaryOfEachDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                   Employee::getDepartment,
                        Collectors.averagingLong(Employee::getSalary)
                ));

        avgSalaryOfEachDepartment.forEach((key, value)->System.out.println(key+" "+value));

        System.out.println(avgSalaryOfEachDepartment);

        Map<String, Double> avgSalaryOfEachDepartment1 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.averagingLong(Employee::getSalary),
                                avg -> BigDecimal.valueOf(avg)
                                        .setScale(2, RoundingMode.HALF_UP)
                                        .doubleValue()
                        )
                ));

        System.out.println(avgSalaryOfEachDepartment1);

    }
}
