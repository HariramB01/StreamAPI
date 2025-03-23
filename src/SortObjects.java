import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortObjects {
    public static void main(String[] args) {
        List<Candidate> list = Arrays.asList(
                new Candidate(1,18,"Hariram"),
                new Candidate(2,19,"Harish"),
                new Candidate(3,20,"Hari"),
                new Candidate(4,21,"Harii")
        );

        //Ascending by age
        System.out.println("Step 1");
        List<Candidate> ascSortByAge = list.stream()
                .sorted(Comparator.comparingInt(Candidate::getAge))
                .collect(Collectors.toList());

        System.out.println(ascSortByAge);

        //Descending by age

        System.out.println("Step 2");
        List<Candidate> descSortByAge = list.stream()
                .sorted(Comparator.comparingInt(Candidate::getAge).reversed())
                .collect(Collectors.toList());

        System.out.println(descSortByAge);

        System.out.println("Step 3");
        Candidate getMaxAge = list.stream()
                .max(Comparator.comparingInt(Candidate::getAge)).orElseThrow();
        System.out.println(getMaxAge);

    }
}
