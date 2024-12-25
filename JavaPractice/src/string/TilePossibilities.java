package string;

import java.util.HashSet;
import java.util.Set;

/**
You have n  tiles, where each tile has one letter tiles[i] printed on it.
Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.
Example 1:
Input: tiles = "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
Example 2:
Input: tiles = "AAABBC"
Output: 188*/
public class TilePossibilities {
    public static void main(String[] args) {
//        String tiles1 = "AAB";
//        System.out.println("Input: tiles = \"" + tiles1 + "\"");
//        System.out.println("Output: " + numTilePossibilities(tiles1));
//        System.out.println();

        String tiles2 = "AAABBC";
        System.out.println("Input: tiles = \"" + tiles2 + "\"");
        System.out.println("Output: " + numTilePossibilities(tiles2));
    }

    public static int numTilePossibilities(String tiles) {
        Set<String> resultSet = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        char[] tileArray = tiles.toCharArray();

        // Sort to handle duplicates more effectively
        java.util.Arrays.sort(tileArray);

        // Start backtracking
        backtrack(resultSet, new StringBuilder(), tileArray, used);

        // Print the possible sequences
        System.out.println("Possible sequences: " + resultSet);

        return resultSet.size();
    }

    private static void backtrack(Set<String> resultSet, StringBuilder currentSequence, char[] tiles, boolean[] used) {
        for (int i = 0; i < tiles.length; i++) {
            // Skip used or duplicate characters
            if (used[i] || (i > 0 && tiles[i] == tiles[i - 1] && !used[i - 1])) {
                continue;
            }

            // Add current character to the sequence
            currentSequence.append(tiles[i]);
            resultSet.add(currentSequence.toString());
            used[i] = true;

            // Recurse further
            backtrack(resultSet, currentSequence, tiles, used);

            // Backtrack
            currentSequence.deleteCharAt(currentSequence.length() - 1);
            used[i] = false;
        }
    }
}
