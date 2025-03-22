import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(   1,"Alice", 22));
        students.add(new Student(2,"Bob", 20));
        students.add(new Student(3,"Charlie", 21));

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 4000),
                new Employee("Bob", "HR", 3500),
                new Employee("Eve", "Finance", 5000),
                new Employee("Eve", "Finance", 5000),
                new Employee("Charlie", "IT", 6000),
                new Employee("Charlie", "IT", 6000),
                new Employee("David", "IT", 7000)
        );

        for (Student s : students) {
            System.out.println(s);
        }
        // Step 1 - Sorting using Comparable (marks ascending)
        System.out.println("Step 1: Sorted using Comparable (by id):");
        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
        // Step 2 - Sorting using Comparator (by name)
        System.out.println("Step 2: Sorted using Comparator (by name):");
//        students.sort(Comparator.comparing(student -> student.getName()));
        students.sort(Comparator.comparing(Student::getName));
        for (Student s : students) {
            System.out.println(s);
        }
        // Step 3 - Sorting using Comparator (by ID descending)
        System.out.println("Step 3: Sorted using Comparator (by ID descending):");
        students.sort(Comparator.comparing(Student::getId).reversed());
        for (Student s : students) {
            System.out.println(s);
        }

        // Step 4 - Sorting by Multiple Criteria
        System.out.println("Step 3: Sorting by Multiple Criteria:");
        Comparator<Student> student = Comparator
                .comparingLong(Student::getSalary)
                .reversed()
                .thenComparing(Student::getName);

        students.sort(student);
        students.forEach(System.out::println);
        System.out.println("Step 5----------");
        Collections.sort(students);
        students.forEach(System.out::println);

        System.out.println("Step 6----------");
        students.stream()
                .sorted(Comparator.comparingLong(Student::getSalary))
                .forEach(System.out::println);
        System.out.println("Step 7----------");
        students.stream()
                .sorted(Comparator.comparing(Student::getSalary).reversed())
                .forEach(System.out::println);

        System.out.println("Step 8----------");
        Map<String, List<Employee>> groupEmployeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupEmployeesByDepartment.forEach(
                (department, employeesList)->{
                    System.out.println(department+" ");
                    employeesList.forEach(employee -> System.out.println(employee.toString()));
                });
    }

}
