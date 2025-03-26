import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
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

        Map<String, List<Employee>> employeeList = employees.stream()
                .collect(Collectors.groupingBy(
                   Employee::getDepartment
                ));

//        Map<String, List<Employee>> employeeList = employees.stream()
//                .collect(Collectors.groupingBy(
//                        employee -> {
//                            if(employee.getDepartment().equals("Finance")) return "Finance";
//                            else if(employee.getDepartment().equals("IT")) return "IT";
//                            else return "HR";
//                        }
//                ));

        employeeList.forEach((key,value)->System.out.println(key+" "+value));
    }
}
