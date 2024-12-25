package string;


public class RegexMatching {
	
    
    public boolean isMatch(String s, String p) {
    	System.out.println("S:"+s+" P:"+p);
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        // Check if the first character matches
        boolean firstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        System.out.println(s.charAt(0)+","+p.charAt(0));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Case 1: '*' means zero of the preceding element
            // Case 2: '*' means one or more of the preceding element
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            // Move to the next character in both s and p
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
/**
    public boolean isMatch(String s, String p) {
        // Create a DP table
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

        // Base case: empty string matches with empty pattern
        dp[0][0] = true;

        // Handle patterns with '*'
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2]; // '*' can eliminate the preceding element
            }
        }

        // Fill the DP table
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    // Characters match, carry forward the result
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    // '*' can represent zero or more of the preceding character
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && 
                              (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                }
            }
        }

        // The answer is in the bottom-right corner of the table
        return dp[s.length()][p.length()];
    }*/


    public static void main(String[] args) {
    	RegexMatching solution = new RegexMatching();

        // Test cases
        System.out.println(solution.isMatch("aa", "a")); // false
        System.out.println(solution.isMatch("aa", "a*")); // true
        System.out.println(solution.isMatch("ab", ".*")); // true
        System.out.println(solution.isMatch("mississippi", "mis*is*p*.")); // false
        System.out.println(solution.isMatch("mississippi", "mis*is*ip*.")); // true
    }
}

