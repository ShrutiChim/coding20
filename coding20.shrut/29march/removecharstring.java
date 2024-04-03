public class RemoveNonAlphabets {
    public static String removeNonAlphabets(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        String input = "Hey123beautiful!";
        String result = removeNonAlphabets(input);
        System.out.println("String after removing non-alphabetic characters: " + result);
    }
}
