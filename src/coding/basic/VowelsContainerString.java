package coding.basic;

public class VowelsContainerString {
    public static void main(String[] args) {
        System.out.println(hasAnyVowels("bcs"));
    }

    public static boolean hasAnyVowels(String test){
        return test.toLowerCase().matches(".*[aeiou].*");
    }
}
