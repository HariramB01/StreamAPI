import java.util.Arrays;
import java.util.List;

public class StreamToArray {

    public static void main(String[] args) {
        List<String> people = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        String[] arr = people.toArray(String[]::new);

        System.out.println(Arrays.toString(arr));


    }

}
