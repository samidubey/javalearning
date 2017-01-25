package javalearning.rectangle;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    // 2147483647
    // 1000000000
    public static void main(String[] args) {

        // System.out.println(getStopCount(new int[] { 2, 3, 5 }, 0, 2));
        // System.out.println(getStopCount(new int[] { 3, 3, 2, 2, 3 }, 0, 5));

        // System.out.println(getIndexAWithinLimit(new int[] { 60, 80, 40 }, 3,
        // 2, 200));
        // System.out.println(getIndexAWithinLimit(new int[] { 40, 40, 100, 80,
        // 20 }, 0, 3, 200));

        solution(new int[] { 40, 40, 100, 80, 20 }, new int[] { 3, 3, 2, 2, 3 }, 3, 5, 200);
        solution(new int[] { 40, 40, 40, 40, 40 }, new int[] { 1, 1, 1, 1, 1 }, 3, 1, 40);
        solution(new int[] { 60, 80, 40 }, new int[] { 2, 3, 5 }, 5, 2, 200);
        solution(new int[] { 10, 10, 10, 10 }, new int[] { 1, 2, 3, 4 }, 5, 5, 200);
        solution(new int[] { 10, 10, 10, 10 }, new int[] { 1, 1, 1, 2 }, 5, 5, 200);

        System.exit(0);

        String[] tests = { "a0Ba", "a0bb", "BA", "bA", "b", "A", "a0B0aBaaa0BAaaaaaaa0B" };

        for (String test : tests) {
            System.out.println(test + " -> " + solution(test));
        }

        System.out.println("===========================================================");

        int[][] test2 = { { 12, 56, 1526 }, { 12345, 678, 16273845 }, { 123, 67890, 16273890 }, { 1234, 0, 10234 }, { 56, 12, 5162 } };
        for (int[] test : test2) {
            int result = solution(test[0], test[1]);
            String testResult = (result == test[2]) ? "PASS" : "FAIL";

            System.out.printf("[%s] | [%d][%d] --> [%d]\n", testResult, test[0], test[1], result);
        }
    }

    public static int getIndexAWithinLimit(int[] A, int startIndex, int X, int Y) {

        int personCount = 0;
        int endIndex = startIndex;
        int totalWeight = 0;

        while (endIndex < A.length && ((totalWeight + A[endIndex]) <= Y) && personCount < X) {
            totalWeight += A[endIndex];
            personCount++;
            endIndex++;
        }

        return endIndex;
    }

    public static int getStopCount(int[] B, int startIndex, int endIndex) {
        int[] bSubset = Arrays.copyOfRange(B, startIndex, endIndex);
        System.out.println("\tStops Array - " + Arrays.toString(bSubset));

        int[] unique = Arrays.stream(bSubset).distinct().toArray();
        System.out.println("\tStops Array[Unique] - " + Arrays.toString(unique));

        // One extra for coming back to ground floor
        return unique.length + 1;
    }

    public static int solution(int[] A, int[] B, int M, int X, int Y) {

        System.out.println("A -> " + Arrays.toString(A));
        System.out.println("B -> " + Arrays.toString(A));
        System.out.println("X -> " + X);
        System.out.println("Y -> " + Y);

        int startIndex = 0;
        int nextIndexInAWithinLimit = 0;
        int stopCount = 0;

        while (startIndex < A.length) {
            nextIndexInAWithinLimit = getIndexAWithinLimit(A, startIndex, X, Y);
            stopCount += getStopCount(B, startIndex, nextIndexInAWithinLimit);
            startIndex = nextIndexInAWithinLimit;
        }

        System.out.println("Total Stops - " + stopCount);
        return stopCount;
    }

    public static int solution(String S) {

        Pattern p = Pattern.compile("([a-z]*[A-Z]+[a-zA-Z]*)");
        Matcher m = p.matcher(S);

        int maxlength = -1;

        while (m.find()) {
            String matchedPassword = m.group(1);

            if (matchedPassword.length() > maxlength) {
                maxlength = matchedPassword.length();
            }
        }

        return maxlength;
    }

    public static int solution(int A, int B) {

        String a = A + "";
        String b = B + "";

        boolean isProcessedA = false;
        boolean isProcessedB = false;

        String resultStr = "0";

        int idx = 0;

        while (!isProcessedA && !isProcessedB) {

            if (idx != a.length()) {
                resultStr += a.substring(idx, idx + 1);
            } else {
                resultStr += b.substring(idx);
                isProcessedB = true;
                isProcessedA = true;
                break;
            }

            if (idx != b.length()) {
                resultStr += b.substring(idx, idx + 1);
            } else {
                resultStr += a.substring(idx + 1);
                isProcessedA = true;
                isProcessedB = true;
                break;
            }

            idx++;
        }

        return Integer.parseInt(resultStr, 10);
    }
}
