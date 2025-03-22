import java.util.*;
import java.util.stream.Collectors;

public class SortingEmployees {
    public static void main(String[] args) {

        /*
        * Important thing to note before working on sorting a list
        *
        * if we use list.sort --> it directly modifies the list
        * returns void
        *
        *
        * if we use list.stream().sorted() --> it doesn't modifies the list directly
        * Returns a new stream with sorted elements
        *
        *
        * */


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 4000),
                new Employee("Bob", "HR", 3500),
                new Employee("Eve", "Finance", 5000),
                new Employee("Eve", "Finance", 5000),
                new Employee("Charlie", "IT", 6000),
                new Employee("Charlie", "IT", 6000),
                new Employee("David", "IT", 7000)
        );


        System.out.println("----------------");

//        Using Comparable (natural ordering)
        employees.stream()
                .sorted(Employee::compareTo)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        employees.stream()
                .sorted((s1,s2)-> s2.compareTo(s1))
                .forEach(System.out::println);


//        groupingBy
        System.out.println("groupByDepartment--------------------------");

        Map<String, List<Employee>> groupByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupByDepartment.toString());
        System.out.println("groupByDepartmentSumSalary--------------------------");

        Map<String, Long> groupByDepartmentSumSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingLong(Employee::getSalary)));

        System.out.println(groupByDepartmentSumSalary.toString());
        System.out.println("groupByDepartmentAndCount--------------------------");

        Map<String,Long> groupByDepartmentAndCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));
        System.out.println(groupByDepartmentAndCount);
        System.out.println("groupByDepartmentAndMaxSalary--------------------------");

        Map<String,Optional<Employee>> groupByDepartmentAndMaxSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))
                ));
        System.out.println(groupByDepartmentAndMaxSalary);
        System.out.println("employeeNamesPerDepartment--------------------------");

        Map<String, List<String>> employeeNamesPerDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        System.out.println(employeeNamesPerDepartment);
        System.out.println("partition--------------------------");

//        paritioningBy
        Map<Boolean, List<Employee>> partition = employees.stream()
                .collect(Collectors.partitioningBy(e->e.getSalary()<5000));
        System.out.println(partition.toString());




    }
}
