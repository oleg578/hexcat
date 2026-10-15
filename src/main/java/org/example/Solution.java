package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        return Arrays.stream(strs)
                .reduce(
                        (a, b) -> a.substring(0,
                                (int) IntStream.range(0, Math.min(a.length(), b.length()))
                                        .takeWhile(i -> a.charAt(i) == b.charAt(i))
                                        .count()))
                .orElse("");
    }
}