import java.util.*;
import java.util.stream.Collector;
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


        //Group by department

        Map<String, List<Employee>> output = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        output.forEach((key, value) -> System.out.println("Department: " + key + "  -> Employee List: " + value));

        /*HashMap doesn't maintains the order, even if i forced it to sort the keys, It'll not.
        * To achieve this, we have to use either LinkedHashMap or TreeMap
        */
        System.out.println("-------------");
        Map<String,Optional<Employee>> highestPaidEmployeeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));

        highestPaidEmployeeByDepartment.forEach((key,value)->System.out.println("Department: "+key+" -> Employee: "+value));


        System.out.println("------Sort keys using TreeMap");

        //Forcing the keys to sorted using TreeMap
        Map<String,Optional<Employee>> sortingKeysOfhighestPaidEmployeeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, ()-> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));

        sortingKeysOfhighestPaidEmployeeByDepartment.forEach((key,value)->System.out.println("Department: "+key+" -> Employee: "+value));

        //Forcing the keys to sorted using LinkedHashMap
        System.out.println("------Sort keys using LinkedHashMap");
        Map<String,Optional<Employee>> sortKeysOfHighestPaidEmployeeByDepartment = highestPaidEmployeeByDepartment.entrySet()
                .stream()
//                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  //No use of having this line
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,LinkedHashMap::new
                ));
        sortKeysOfHighestPaidEmployeeByDepartment.forEach((key1, value1) -> System.out.println(key1 + "     " + value1));

        /*
        * We can't use the foreach after collect
        * Not in the same stream.  Once we received  the data, we can create a new stream
        * from there we can create new stream for printing the data.
        * */
        System.out.println("------Sort keys double stream");

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println("Department: " + entry.getKey() + ", Employee: " + entry.getValue().orElse(null)));


        //Group by department
        System.out.println("------Group by department as key and value as total employee count");
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting())
                ).forEach((key, value) -> System.out.println("Department: " + key + ", Employee: " + value));


    }
}
