package com.chainsys.programingFundamental;
public class CommonPrefix {
    public static void main(String[] args) {
        String[] name = { "flower", "flow", "gflat" };
        System.out.println("Longest prefix: " + longestPrefix(name));
    }
    public static String longestPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int maxLengthprefix = prefix.length();
        String longestSubstring = "";
        for (int i = 0; i < maxLengthprefix; i++) {
            for (int j = i + 1; j <= maxLengthprefix; j++) {
                String substring = prefix.substring(i, j);
                if (longPrefix(strs, substring) && substring.length() > longestSubstring.length()) {
                    longestSubstring = substring;
                }
            }
        }
        return longestSubstring;
    }
    private static boolean longPrefix(String[] strs, String substring) {
        for (String str : strs) {
            if (!str.contains(substring)) {
                return false;
            }
        }
        return true;
    }
}