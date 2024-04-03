import java.util.HashMap;

public class WordMostRepeatedLetters {
    public static String findWordMostRepeatedLetters(String str) {
        String[] words = str.split(" ");
        String resultWord = "";
        int maxRepeated = 0;

        for (String word : words) {
            HashMap<Character, Integer> charCount = new HashMap<>();
            int wordRepeated = 0;

            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                wordRepeated = Math.max(wordRepeated, charCount.get(c));
            }

            if (wordRepeated > maxRepeated) {
                maxRepeated = wordRepeated;
                resultWord = word;
            }
        }

        return maxRepeated > 1 ? resultWord : "-1";
    }

    public static void main(String[] args) {
        String str1 = "abcdefghij google microsoft";
        String str2 = "cameron blue";

        String result1 = findWordMostRepeatedLetters(str1);
        String result2 = findWordMostRepeatedLetters(str2);

        System.out.println("Output for '" + str1 + "': " + result1);
        System.out.println("Output for '" + str2 + "': " + result2);
    }
}
