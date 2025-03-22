import java.util.Arrays;
import java.util.List;

public class ComparableComparator {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Alice", 5000),
                new Student(2, "Bob", 3000),
                new Student(3, "Charlie", 7000)
        );
/*
 * Important thing to note before working on sorting a list
 *
 * if we use list.sort --> it directly modifies the list
 * returns void
 *
 *
 * if we use list.stream().sorted() --> it doesn't modifies the list directly
 * Returns a new stream with sorted elements
* There are two ways to order/arrange the elements
*
* 1. Comparable --> natural ordering
* 2. Comparator --> Custom ordering on demands or multiple sort orders
*
* Comparable --> compareTo(T t)  compare this object to another
* Comparator --> compare(T t1, T t2) compare two given objects
*
* we can use compareTo inside but that doesn't mean we are using comparable
* - we are just calling it on a field like String that happens to implement Comparable
*
*
*
* */






    }
}
