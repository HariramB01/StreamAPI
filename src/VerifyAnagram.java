
public class VerifyAnagram {
    public static void main(String[] args) {
        String s1 = "gum";
        String s2 = "mug";

        boolean isAnagram = s1.chars().sorted().boxed().toList()
                .equals(s2.chars().sorted().boxed().toList());

        System.out.println(isAnagram);

    }
}
