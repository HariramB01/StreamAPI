import java.util.stream.IntStream;

public class CheckPalindrome {
    public static void main(String[] args) {
        String word = "abcbaa";
        boolean result = IntStream.range(0,word.length()/2)
                .allMatch(i->word.charAt(i)==word.charAt(word.length()-i-1));
        System.out.println(result);
    }
}
