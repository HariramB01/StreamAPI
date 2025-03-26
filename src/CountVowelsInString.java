public class CountVowelsInString {
    public static void main(String[] args) {
        String word = "hariram";
        long count = word.toLowerCase().chars()
                .filter(s->"aeiou".indexOf(s)>=0)
                .count();

        System.out.println(count);
    }
}
