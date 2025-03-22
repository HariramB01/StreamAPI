import java.util.Arrays;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "I am hariram Working as a Java developer";
        int count = (int) Arrays.stream(sentence.split(" ")).count();
        System.out.println(count);
    }
}
