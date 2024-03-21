package indices;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        int[] indices = findWordsContainingCharacter(words, x);
        System.out.println("Output:");
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }

    public static int[] findWordsContainingCharacter(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        return indices.stream().mapToInt(i -> i).toArray();
    }
}

