package arrays;

import java.util.Arrays;

public class CountVowelString {

    public static void main(String[] args) {
        CountVowelString cv = new CountVowelString();
        int[][] queries = { { 0, 2 }, { 1, 4 }, { 1, 1 } };
        String words[] = { "aba", "bcb", "ece", "aa", "e" };

        System.out.println(Arrays.toString(cv.vowelStrings(words, queries)));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixCount = new int[words.length + 1];
        String vowels = "aeiou";

        // Preprocess to create prefix sums of vowel string counts
        for (int i = 0; i < words.length; i++) {
            if (vowels.indexOf(words[i].charAt(0)) != -1 
                && vowels.indexOf(words[i].charAt(words[i].length() - 1)) != -1) {
                prefixCount[i + 1] = prefixCount[i] + 1;
            } else {
                prefixCount[i + 1] = prefixCount[i];
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixCount[ri + 1] - prefixCount[li];
        }

        return result;
    }
}
