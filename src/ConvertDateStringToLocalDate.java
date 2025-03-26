import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertDateStringToLocalDate {
    public static void main(String[] args) {
        List<String> dateStrings = List.of("2024-03-01", "2025-06-15", "2023-12-10","2024-03-02", "2025-06-16", "2023-12-11");
        dateStrings.stream()
                .map(date -> LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .forEach(System.out::println);

        //group by year

    }
}
